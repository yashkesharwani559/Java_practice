class K{
    final int x;
    final int y = 34;
}
//this will give error because final variables are not initialized by default constructor
// K.java:2: error: variable x not initialized in the default constructor
//     final int x;
//               ^
// 1 error