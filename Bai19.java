public class Bai19 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int m = a.length, n = a[0].length;

        System.out.println("Ma trận ban đầu:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        System.out.println("Ma trận chuyển vị:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
