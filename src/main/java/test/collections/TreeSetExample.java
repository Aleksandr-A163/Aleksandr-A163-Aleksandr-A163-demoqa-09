package test.collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

    private TreeSet<Integer> treeSet;

    public TreeSetExample() {
        treeSet = new TreeSet<>();
    }

    // Метод для добавления элементов в TreeSet
    public void addElements(int[] elements) {
        for (int element : elements) {
            treeSet.add(element);
        }
    }

    // Метод для удаления элемента из TreeSet
    public void removeElement(int element) {
        treeSet.remove(element);
    }

    // Метод для поиска элемента в TreeSet
    public boolean searchElement(int element) {
        return treeSet.contains(element);
    }

    // Метод для вывода всех элементов TreeSet
    public void printElements() {
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeSetExample example = new TreeSetExample();

        // Добавление элементов
        int[] elementsToAdd = {10, 20, 30, 40, 50};
        example.addElements(elementsToAdd);
        System.out.print("После добавления элементов: ");
        example.printElements();

        // Удаление элемента
        example.removeElement(30);
        System.out.print("После удаления элемента 30: ");
        example.printElements();

        // Поиск элемента
        int elementToSearch = 20;
        boolean found = example.searchElement(elementToSearch);
        System.out.println("Элемент " + elementToSearch + " найден: " + found);

        // Проверка отсутствующего элемента
        elementToSearch = 30;
        found = example.searchElement(elementToSearch);
        System.out.println("Элемент " + elementToSearch + " найден: " + found);
    }
}