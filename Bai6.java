public class Bai6 {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,3,4};
        int maxCount = 0, value = a[0];

        for (int i = 0; i < a.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) cnt++;

            if (cnt > maxCount) {
                maxCount = cnt;
                value = a[i];
            }
        }

        System.out.println("Số: " + value + ", Số lần: " + maxCount);
    }
}
