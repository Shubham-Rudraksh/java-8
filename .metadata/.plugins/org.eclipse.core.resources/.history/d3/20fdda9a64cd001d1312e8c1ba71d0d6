package StringStream;

import java.util.*;

public class SalesTask {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] items = new int[n];
for (int i = 0; i < n; i++) {
items[i] = sc.nextInt();
}
int m = sc.nextInt();
sc.close();
// Count the frequency of each item ID
Map<Integer, Integer> freq = new HashMap<>();
for (int id : items) {
freq.put(id, freq.getOrDefault(id, 0) + 1);
}
// Sort the frequencies in descending order
List<Integer> counts = new ArrayList<>(freq.values());
Collections.sort(counts, Collections.reverseOrder());
// Greedily remove the items with the highest frequency
int typesLeft = 0;
for (int count : counts) {
if (m >= count) {
m -= count;
typesLeft++;
} else {
break;
}
}
System.out.println(typesLeft);
}
}
