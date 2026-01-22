import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");

        for (String w : words) {
            String rev = "";
            for (int i = w.length() - 1; i >= 0; i--)
                rev += w.charAt(i);
            System.out.print(rev + " ");
        }
    }
}
