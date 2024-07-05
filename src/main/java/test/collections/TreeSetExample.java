package test.collections;

import java.util.TreeSet;

public class TreeSetExample {

    private TreeSet<String> treeSet;

    // Конструктор для инициализации TreeSet и добавления элементов
    public TreeSetExample() {
        treeSet = new TreeSet<>();
        treeSet.add("AAA");
        treeSet.add("AA");
        treeSet.add("BBB");
        treeSet.add("BB");
        treeSet.add("CCC");
        treeSet.add("CC");
    }

    // Метод для поиска элемента в TreeSet (с использованием цикла for)
    public boolean findElement(String element) {
        for (String elem : treeSet) {
            if (elem.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Метод для удаления элемента из TreeSet (с использованием цикла while)
    public boolean removeElement(String element) {
        boolean removed = false;
        while (treeSet.remove(element)) {
            removed = true;
        }
        return removed;
    }

    // Метод для подсчета общего количества элементов в TreeSet
    public int countElements() {
        return treeSet.size();
    }

    // Метод для вывода всех элементов TreeSet (для тестирования, с использованием цикла for-each)
    public void printElements() {
        System.out.println("Elements in TreeSet:");
        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}