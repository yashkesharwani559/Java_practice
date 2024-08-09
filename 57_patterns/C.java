class C{
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = 0; j < i+1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */