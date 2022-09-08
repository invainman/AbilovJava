package thirdtask;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();

        int size = app.inputNumber("Введите размер массива: ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = app.inputNumber("Введите " + i + " элемент массива: ");
        }

        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public int inputNumber(String message) {
        Scanner in = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println(message);
            String str = in.nextLine();
            str = str.trim();

            try {
                num = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Некорректный ввод");
                continue;
            }

            return num;
        }
    }
}
