public class Max1020 {
    public int max1020(int a, int b) {
        if (b > a) {
            // swap to make 'a' always the larger one
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}