package test.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> list;
    private int integerVariable;
    private double doubleVariable;
    private boolean booleanVariable;
    private String stringVariable;

    public Main() {
        list = new ArrayList<>();
        integerVariable = 0;
        doubleVariable = 0.0;
        booleanVariable = false;
        stringVariable = "default";
    }

    // Метод для добавления элементов
    public void addElements(String... elements) {
        for (String element : elements) {
            list.add(element);
        }
        System.out.println("After adding elements:");
        printElements();
    }

    // Метод для удаления элемента по индексу
    public void removeElementByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
        System.out.println("After removing element at index " + index + ":");
        printElements();
    }

    // Метод для поиска элемента
    public boolean findElement(String element) {
        boolean found = list.contains(element);
        System.out.println("Element '" + element + "' found: " + found);
        return found;
    }

    // Метод для печати всех элементов
    public void printElements() {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // Метод для выполнения всех действий
    public void executeActions() {
        // Добавление элементов
        addElements("January", "February", "March", "April", "May");

        // Поиск элемента
        findElement("March"); // true
        findElement("June");  // false

        // Удаление элемента по индексу
        removeElementByIndex(2); // индекс элемента "March"
        removeElementByIndex(0); // индекс элемента "January"
        removeElementByIndex(3); // неверный индекс (вне диапазона)
    }

    // Методы для установки значений переменных
    public void setIntegerVariable(int value) {
        this.integerVariable = value;
        System.out.println("Integer variable set to: " + integerVariable);
    }

    public void setDoubleVariable(double value) {
        this.doubleVariable = value;
        System.out.println("Double variable set to: " + doubleVariable);
    }

    public void setBooleanVariable(boolean value) {
        this.booleanVariable = value;
        System.out.println("Boolean variable set to: " + booleanVariable);
    }

    public void setStringVariable(String value) {
        this.stringVariable = value;
        System.out.println("String variable set to: " + stringVariable);
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Установка значений переменных
        main.setIntegerVariable(42);
        main.setDoubleVariable(3.14);
        main.setBooleanVariable(true);
        main.setStringVariable("example");

        // Выполнение действий с элементами списка
        main.executeActions();
    }
}