public class O {
    public static void main(String[] args) {
        int i = 1_00_000;

        // int j = _23;//compilation fail
        // int j = 23_;//compilation fail

        System.out.println(i == 100000);// true

    }
}
//output
// true

// means we can use underscores between digits to make a numeric literal/constant
// but a numeric literal/constant can't have underscore in the starting or end.