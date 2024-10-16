import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) { // Внешний цикл для высоты треугольника
            for (int j = 1; j <= i; j++) { // Внутренний цикл для печати звездочек
                System.out.print("*"); // Печатаем звездочку
            }
            System.out.println(); // Переход на новую строку после каждой строки треугольника
        }

        scanner.close(); // Закрываем сканер
    }
}