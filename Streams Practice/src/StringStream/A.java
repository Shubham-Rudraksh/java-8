package StringStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				Map<Character,Integer > map = new HashMap<>();
				for (char c : s.toCharArray()) {
					map.put(c, map.getOrDefault(c, 0)+1);
					
				}
				System.out.println(map);
				int maxPieces = Collections.min(map.values());
				System.out.println(maxPieces);
	}

}
