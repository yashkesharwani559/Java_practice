class F{
    private abstract void pro();
}

//this will give error because we cannot define a method as private and static at the same time
// this will give error as 
// F.java:2: error: illegal combination of modifiers: abstract and private
//     private abstract void pro();
//                           ^
// 1 error