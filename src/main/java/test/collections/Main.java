package test.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> list = new ArrayList<>();

    // Добавление 5 элементов
    public void addElements(String element1, String element2, String element3, String element4, String element5) {
        list.add(element1);
        list.add(element2);
        list.add(element3);
        list.add(element4);
        list.add(element5);
    }

    // Удаление элемента по индексу
    public void removeElementByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    // Поиск элемента
    public boolean findElement(String element) {
        for (String item : list) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Печать всех элементов
    public void printElements() {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addElements("January", "February", "March", "April", "May");
        main.printElements();

        System.out.println(main.findElement("March")); // true

        int removeIndex = 2; // индекс элемента "March"
        main.removeElementByIndex(removeIndex);
        main.printElements();

        int removeIndex2 = 0; // индекс элемента "January"
        main.removeElementByIndex(removeIndex2);
        main.printElements();

        int removeIndex3 = 3; // неверный индекс (вне диапазона)
        main.removeElementByIndex(removeIndex3);
        main.printElements();
    }
}