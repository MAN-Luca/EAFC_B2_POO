package snake_game.projetEAFC;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:snake_game.db";

    public DatabaseManager() {
        createTablesIfNotExist();
    }

    private void createTablesIfNotExist() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {

            String createUsers = """
                CREATE TABLE IF NOT EXISTS users (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    username TEXT UNIQUE NOT NULL,
                    best_score INTEGER DEFAULT 0
                )
            """;

            String createScores = """
                CREATE TABLE IF NOT EXISTS scores (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    user_id INTEGER NOT NULL,
                    score INTEGER NOT NULL,
                    date TEXT NOT NULL,
                    FOREIGN KEY(user_id) REFERENCES users(id)
                )
            """;

            stmt.execute(createUsers);
            stmt.execute(createScores);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getOrCreateUserId(String username) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            // Check if user exists (case-insensitive)
            String query = "SELECT id FROM users WHERE LOWER(username) = LOWER(?)";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, username);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) return rs.getInt("id");
            }

            // Insert if not found
            String insert = "INSERT INTO users(username) VALUES(?)";
            try (PreparedStatement ps = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, username);
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // error
    }

    public void insertScore(int userId, int score) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            // Insert into score history
            String insert = "INSERT INTO scores(user_id, score, date) VALUES(?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insert)) {
                ps.setInt(1, userId);
                ps.setInt(2, score);
                ps.setString(3, LocalDate.now().toString());
                ps.executeUpdate();
            }

            // Update best score only if this one is higher
            String update = "UPDATE users SET best_score = ? WHERE id = ? AND ? > best_score";
            try (PreparedStatement ps = conn.prepareStatement(update)) {
                ps.setInt(1, score);
                ps.setInt(2, userId);
                ps.setInt(3, score);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getBestScore(int userId) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT best_score FROM users WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setInt(1, userId);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) return rs.getInt("best_score");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getTopUser() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT username FROM users ORDER BY best_score DESC LIMIT 1";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ResultSet rs = ps.executeQuery();
                if (rs.next()) return rs.getString("username");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getAllUsernames() {
        List<String> usernames = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT username FROM users ORDER BY username";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    usernames.add(rs.getString("username"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usernames;
    }

    public List<String> getAllScores() {
        List<String> scores = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String query = """
                SELECT u.username, s.score, s.date 
                FROM scores s
                JOIN users u ON s.user_id = u.id
                ORDER BY s.score DESC
            """;
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String row = rs.getString("username") + " - " +
                            rs.getInt("score") + " pts - " +
                            rs.getString("date");
                    scores.add(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return scores;
    }
}
