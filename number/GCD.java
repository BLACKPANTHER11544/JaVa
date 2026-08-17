class GCD {
    public int FindGDC(int n1, int n2) {
        int divisor = 1;
        for (int i = 2; i < Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }

    public static void main(String args[]) {
        GCD obj = new GCD();
        System.out.println(obj.FindGDC(20, 15));
    }
}