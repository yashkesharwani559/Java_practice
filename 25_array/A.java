class A{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\n++i");
        for (int i = 0; i < 5; ++i) {
            System.out.print(i + ", ");
        }
    }
}
//this will print output as
// 0, 1, 2, 3, 4,

// i++
// 0, 1, 2, 3, 4,

//so this means in case of for loop increment i++ and ++i are same
// and the sequence in which the loop statement runs is

// 1. initialization
// 2. condition check
// 3. if passed then running of the loop body
// 4. increment
// 5. condition check 
// 6. if passed then running of the loop body
// 7. increment
// 8. and so on