package javaErrorException.HomeWork_003;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Введены некоректные данные");
        System.out.printf("Некоректный формат данных: %s", i);
        System.out.println();
    }
}
