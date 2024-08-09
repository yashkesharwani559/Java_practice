class O{
    final int x =34;
    final static int y = 34;
    O(){
        x = 45;
        y = 56;
    }
}

//once the final variable are declared they cannot be changed from anywhere
// that's why it is giving error as
// O.java:5: error: cannot assign a value to final variable x
//         x = 45;
//         ^
// O.java:6: error: cannot assign a value to final variable y
//         y = 56;
//         ^
// 2 errors