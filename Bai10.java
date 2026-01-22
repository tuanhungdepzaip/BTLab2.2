public class Bai10 {
    public static void main(String[] args) {
        int[] a = {5,1,4,5};

        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x < max && x > second)
                second = x;
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("Không tồn tại");
        else
            System.out.println("Số lớn thứ hai: " + second);
    }
}
