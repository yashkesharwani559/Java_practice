interface J6{
    protected void pro();
}
//this will give error because a method inside the interface cannot be made protected in java
// J6.java:2: error: modifier protected not allowed here
//     protected void pro();
//                    ^
// 1 error

// point to be noted that when we write a method inside interface in java it is implicitly marked as public so a method inside an interface cannot have default access control in java