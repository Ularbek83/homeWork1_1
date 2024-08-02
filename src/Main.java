import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String myAddress;

        final int NUM = 49;

        String world = " Талас";

        System.out.println(" Мой адресс: город " + (world) + ", ул. Манас , дом " + (NUM));

        if (NUM < 0) {
            System.out.println(" Вы сохранили отрицательное число ");

        } else if (NUM > 0) {
            System.out.println(" Вы сохранили положительное число ");

        }else {
            System.out.println(" Вы сохранили ноль ");

        }
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Введите ваше имя ");
            String vashe = scanner.nextLine();
            System.out.println(" Салам алейкум  " + (vashe) + "!" );
        }
    }

