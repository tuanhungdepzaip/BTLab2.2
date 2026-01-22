import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        boolean hoa=false, thuong=false, so=false, kt=false;

        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) hoa = true;
            else if (Character.isLowerCase(c)) thuong = true;
            else if (Character.isDigit(c)) so = true;
            else kt = true;
        }

        if (p.length() >= 8 && hoa && thuong && so && kt)
            System.out.println("Mật khẩu mạnh");
        else
            System.out.println("Mật khẩu yếu");
    }
}
