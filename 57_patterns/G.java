class G{
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = 1;
            
            for (int j = i; j < n; j++) {
               System.out.print(count++ + " ");
            }
            
            System.out.println();
        }
    }
}

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */