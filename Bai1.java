import java.util.Scanner;

class SinhVien {
    String ma, ten;
    double diem;
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        SinhVien[] ds = new SinhVien[n];
        double tong = 0;

        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();
            System.out.print("Mã SV: ");
            ds[i].ma = sc.nextLine();
            System.out.print("Tên SV: ");
            ds[i].ten = sc.nextLine();
            System.out.print("Điểm: ");
            ds[i].diem = sc.nextDouble();
            sc.nextLine();
            tong += ds[i].diem;
        }

        System.out.println("Điểm trung bình: " + tong / n);

        System.out.println("Sinh viên đạt:");
        for (SinhVien sv : ds)
            if (sv.diem >= 5)
                System.out.println(sv.ten);

        System.out.println("Sinh viên không đạt:");
        for (SinhVien sv : ds)
            if (sv.diem < 5)
                System.out.println(sv.ten);
    }
}
