package test.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> list = new ArrayList<>();

    // Метод для добавления элементов
    public void addElements(String... elements) {
        for (String element : elements) {
            list.add(element);
        }
    }

    // Метод для удаления элемента по индексу
    public void removeElementByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    // Метод для поиска элемента
    public boolean findElement(String element) {
        for (String item : list) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Метод для печати всех элементов
    public void printElements() {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Добавление элементов
        main.addElements("January", "February", "March", "April", "May");
        main.printElements();

        // Поиск элемента
        System.out.println(main.findElement("March")); // true

        // Удаление элемента по индексу
        removeElement(main, 2); // индекс элемента "March"
        removeElement(main, 0); // индекс элемента "January"
        removeElement(main, 3); // неверный индекс (вне диапазона)
    }

    // Вспомогательный метод для удаления элемента и печати оставшихся элементов
    private static void removeElement(Main main, int index) {
        main.removeElementByIndex(index);
        main.printElements();
    }
}