package test.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    private LinkedList<Integer> numbers;

    public static void main(String[] args) {
        LinkedListExample example = new LinkedListExample();
        example.executeActions();
    }

    public LinkedListExample() {
        numbers = new LinkedList<>();
    }

    // Метод для добавления элементов в список
    public void addElements(int... elements) {
        for (int element : elements) {
            numbers.add(element);
        }
    }

    // Метод для удаления элементов из списка
    public void removeElements(int threshold) {
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > threshold) {
                iterator.remove();
            }
        }
    }

    // Метод для поиска элемента в списке
    public boolean searchElement(int element) {
        return numbers.contains(element);
    }

    // Метод для вывода всех элементов списка
    public void printElements() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Метод для выполнения действий добавления, удаления и поиска
    public void executeActions() {
        // Добавление элементов
        addElements(10, 20, 30);
        System.out.println("После добавления элементов:");
        printElements();

        // Удаление элементов
        System.out.println("Удаление элементов из LinkedList:");
        removeElements(15);
        System.out.println("Оставшиеся элементы:");
        printElements();

        // Поиск элемента
        int elementToSearch = 20;
        boolean found = searchElement(elementToSearch);
        System.out.println("Элемент " + elementToSearch + " найден: " + found);

        // Проверка отсутствующего элемента
        elementToSearch = 10;
        found = searchElement(elementToSearch);
        System.out.println("Элемент " + elementToSearch + " найден: " + found);
    }


}