public class Bai12 {
    static int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {123, 45, 6};

        for (int x : a)
            System.out.println(x + " → " + sumDigits(x));
    }
}
