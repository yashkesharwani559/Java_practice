interface F{
    int x;
}
//this will give error because we cannot only declare the instance variables inside the interface
//the thing we have to do is to decaration and initialization at the same time 
// here it will give error as
// F.java:2: error: = expected
//     int x;
//          ^
// 1 error

//this is giving error because whenever a variable is created inside the interface compile implicitly assign it modifier as 'public final'