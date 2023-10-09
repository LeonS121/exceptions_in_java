package javaErrorException.HomeWork_003;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Введены некоректные данные");
        System.out.printf("Некоректный формат данных: %s", i);
        System.out.println();
    }
}
