class D{
    public static void main(String[] args) {
        int n = 5;
        int count = 65;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print((char)count++ + " ");
            }
            
            System.out.println();
        }
    }
}

/*
A
B C
D E F
G H I J
K L M N O
 */