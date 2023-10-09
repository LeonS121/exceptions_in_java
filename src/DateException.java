package javaErrorException.HomeWork_003;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Введены некоректные данные");
        System.out.printf("Некоректный формат данных: %s", i);
        System.out.println();
    }
}
