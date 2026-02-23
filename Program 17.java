class Subtract {
    int a[][] = { {9, 8}, {7, 6} };   
    int b[][] = { {1, 2}, {3, 4} };   
    int c[][] = new int[2][2];        

    void subtract() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    void display() {
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Subtract obj = new Subtract(); 
        obj.subtract();                            
        obj.display();                             
    }
}

