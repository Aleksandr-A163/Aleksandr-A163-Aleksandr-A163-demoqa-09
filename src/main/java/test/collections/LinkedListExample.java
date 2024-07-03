package test.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Добавление элементов в список
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Итератор для перебора элементов списка
        ListIterator<Integer> iterator = numbers.listIterator();

        // Удаление элементов из списка, используя цикл do-while
        System.out.println("Удаление элементов из LinkedList:");
        do {
            int num = iterator.next();
            if (num > 15) {
                iterator.remove();
            }
        } while (iterator.hasNext());

        // Вывод оставшихся элементов списка
        System.out.println("Оставшиеся элементы:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}