public class Bai4 {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int max = a[0], sum = a[0];

        for (int i = 1; i < a.length; i++) {
            sum = Math.max(a[i], sum + a[i]);
            max = Math.max(max, sum);
        }

        System.out.println("Tổng lớn nhất: " + max);
    }
}
