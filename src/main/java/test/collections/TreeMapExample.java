package test.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

    }

    // Метод для добавления элементов в TreeMap
    private static void addElements(TreeMap<String, Integer> treeMap) {
        String[] keys = {"One", "Two", "Three"};
        int[] values = {1, 2, 3};

        for (int i = 0; i < keys.length; i++) {
            treeMap.put(keys[i], values[i]);
        }
    }

    // Метод для удаления элемента из TreeMap
    private static void removeElement(TreeMap<String, Integer> treeMap, String keyToRemove) {
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getKey().equals(keyToRemove)) {
                System.out.println("Удаление элемента '" + keyToRemove + "'. Значение: " + entry.getValue());
                treeMap.remove(entry.getKey());
                break;
            }
        }
    }

    // Метод для поиска элемента в TreeMap
    private static void findElement(TreeMap<String, Integer> treeMap, String keyToFind) {
        Integer value = treeMap.get(keyToFind);
        if (value != null) {
            System.out.println("Элемент найден: Key: " + keyToFind + ", Value: " + value);
        } else {
            System.out.println("Элемент с ключом '" + keyToFind + "' не найден.");
        }
    }
}