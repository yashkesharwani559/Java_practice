interface M{
    static{

    }
}
//this will give error because we cannot create static block inside an interface
// M.java:2: error: initializers not allowed in interfaces
//     static{
//           ^
// 1 error