package secondtask;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Введите имя: ");
            String str = in.nextLine();
            str = str.trim();
            if ("Вячеслав".equalsIgnoreCase(str)) {
                System.out.println("Привет, Вячеслав");
                flag = false;
            } else {
                System.out.println("Нет такого имени");
            }
        }
        in.close();
    }
}
