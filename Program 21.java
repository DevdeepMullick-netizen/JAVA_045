class Main {
    public static void main(String[] args) {

        int[] a = {3, 1, 5};
        int[] b = {4, 2, 6};

        int[] c = new int[a.length + b.length];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            c[k] = a[i];
            k++;
        }

        for (int i = 0; i < b.length; i++) {
            c[k] = b[i];
            k++;
        }

        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}