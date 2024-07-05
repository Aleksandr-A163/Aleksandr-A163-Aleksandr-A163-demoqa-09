package test.collections;

import java.util.LinkedList;

public class LinkedListExample {

    private LinkedList<Integer> linkedList;

    // Конструктор для инициализации LinkedList и добавления элементов
    public LinkedListExample() {
        linkedList = new LinkedList<>();
        linkedList.add(101);
        linkedList.add(657);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(55);
        linkedList.add(69);
        linkedList.add(-65477);
    }

    // Метод для поиска элемента в LinkedList (с использованием цикла for)
    public boolean findElement(int element) {
        for (Integer num : linkedList) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    // Метод для удаления элемента из LinkedList (с использованием цикла while)
    public boolean removeElement(int element) {
        boolean removed = false;
        while (linkedList.remove(Integer.valueOf(element))) {
            removed = true;
        }
        return removed;
    }

    // Метод для подсчета общего количества элементов в LinkedList
    public int countElements() {
        return linkedList.size();
    }

    // Метод для вывода всех элементов LinkedList (для тестирования)
    public void printElements() {
        System.out.println("Elements in LinkedList:");
        for (Integer element : linkedList) {
            System.out.println(element);
        }
    }
}