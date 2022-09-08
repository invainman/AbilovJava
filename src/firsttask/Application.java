package firsttask;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        int num = 0;
        while (flag) {
            System.out.print("Введите число: ");
            String str = in.nextLine();
            str = str.trim();
            try {
                num = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Некорректный ввод");
                continue;
            }

            flag = false;
        }

        if (num > 7) {
            System.out.println("Привет");
        }

        in.close();
    }
}
