package test.collections;

import java.util.Deque;
import java.util.LinkedList;

public class CarDequeExample {

    private Deque<String> carDeque;


    public CarDequeExample() {
        carDeque = new LinkedList<>();
    }

    // Метод для добавления элементов в конец очереди
    public void addElements(String... cars) {
        for (String car : cars) {
            carDeque.add(car);
        }
        System.out.println("После добавления элементов: " + carDeque);
    }

    // Метод для поиска элемента в очереди
    public void searchElement(String car) {
        boolean found = carDeque.contains(car);
        if (found) {
            System.out.println(car + " найден в очереди.");
        } else {
            System.out.println(car + " не найден в очереди.");
        }
    }

    // Метод для удаления первого элемента из очереди
    public void removeFirstElement() {
        String firstCar = carDeque.removeFirst();
        System.out.println("Удален первый элемент: " + firstCar);
        System.out.println("После удаления первого элемента: " + carDeque);
    }

    // Метод для удаления последнего элемента из очереди
    public void removeLastElement() {
        String lastCar = carDeque.removeLast();
        System.out.println("Удален последний элемент: " + lastCar);
        System.out.println("После удаления последнего элемента: " + carDeque);
    }

    // Метод для удаления определенного элемента из очереди
    public void removeElement(String car) {
        boolean removed = carDeque.remove(car);
        if (removed) {
            System.out.println(car + " был удален.");
        } else {
            System.out.println(car + " не был найден.");
        }
        System.out.println("После удаления элемента: " + carDeque);
    }

}