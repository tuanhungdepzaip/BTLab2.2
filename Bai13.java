import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().toLowerCase();

        String[] words = s.split("\\s+");
        String result = "";

        for (String w : words)
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";

        System.out.println(result.trim());
    }
}
