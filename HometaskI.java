// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Hometasks;

import java.util.Scanner;

public class HometaskI {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = newScanner.nextInt();
        newScanner.close();
        System.out.println("Треугольное число: " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}

