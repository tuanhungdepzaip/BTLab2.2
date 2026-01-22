public class Bai18 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int main = 0, sub = 0;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            main += a[i][i];
            sub += a[i][n - i - 1];
        }

        System.out.println("Chéo chính: " + main);
        System.out.println("Chéo phụ: " + sub);
    }
}
