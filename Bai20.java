import java.util.Random;
import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int number = rd.nextInt(100) + 1;
        int maxTry = 7;

        System.out.println("Đoán số từ 1 đến 100");

        for (int i = 1; i <= maxTry; i++) {
            System.out.print("Lần " + i + ": ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("🎉 Đúng rồi!");
                return;
            } else if (guess < number)
                System.out.println("Nhỏ hơn");
            else
                System.out.println("Lớn hơn");
        }

        System.out.println("❌ Hết lượt! Số đúng là: " + number);
    }
}
