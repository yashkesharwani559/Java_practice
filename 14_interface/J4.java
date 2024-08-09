interface J4{
    final void pro();
}
//this will give error because by default, the method written inside interface is abstract and we cannot mark final abstract at the same time on a method
// J4.java:2: error: modifier final not allowed here
//     final void pro();
//                ^
// 1 error