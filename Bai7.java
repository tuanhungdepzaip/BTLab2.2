public class Bai7 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};

        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int x : a) c[k++] = x;
        for (int x : b) c[k++] = x;

        for (int i = 0; i < k; i++) {
            boolean ok = true;
            for (int j = 0; j < i; j++)
                if (c[i] == c[j]) ok = false;
            if (ok) System.out.print(c[i] + " ");
        }
    }
}
