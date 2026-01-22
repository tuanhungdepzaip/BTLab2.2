import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("\\s+");
        System.out.println("Số từ: " + words.length);
    }
}
