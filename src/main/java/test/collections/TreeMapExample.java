package test.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Добавление элементов в TreeMap
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Удаление элемента "Two" из TreeMap с использованием цикла while
        String keyToRemove = "Two";
        Map.Entry<String, Integer> entry = treeMap.firstEntry();

        // Цикл while для удаления элемента
        while (entry != null) {
            if (entry.getKey().equals(keyToRemove)) {
                System.out.println("Удаление элемента '" + keyToRemove + "'. Значение: " + entry.getValue());
                treeMap.remove(entry.getKey());
                break;
            }
            entry = treeMap.higherEntry(entry.getKey());
        }

        // Печать оставшихся элементов TreeMap
        System.out.println("Оставшиеся элементы TreeMap после удаления:");
        for (Map.Entry<String, Integer> remainingEntry : treeMap.entrySet()) {
            System.out.println("Key: " + remainingEntry.getKey() + ", Value: " + remainingEntry.getValue());
        }
    }
}