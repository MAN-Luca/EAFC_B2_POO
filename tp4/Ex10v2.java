package tp4;

import java.util.HashMap;

import mes_fonctions.MyFunc;

public class Ex10v2 {

	public static void main(String[] args) {
		int[] t = {1, 2, 2, 3, 3, 3, 3, 5}; // Tableau d'entrée
		HashMap<Integer, Integer> map = new HashMap<>();
		
		MyFunc.afficheMessage("Tableau de fréquence");
		for (int elem : t) {
			if (!map.containsKey(elem)) {
				map.put(elem, 1);
			} else {
				map.put(elem, map.get(elem) + 1);
			}
		}
		for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
		MyFunc.messageFin();  // Affiche un message de fin
	}

}
