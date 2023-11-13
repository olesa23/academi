import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 13 != 0) {
                System.out.println("Прорускаем:" + i);
                continue;

            }
            System.out.println(i);

        }
    }
}
