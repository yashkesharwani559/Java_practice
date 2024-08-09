public class x1{

}

public class C1{

}

public interface X2{

}

public interface c2{

}

//here we get three errors which means that we can mark the class or enum as public only when the class or interface name is same as file name
C1.java:1: error: class x1 is public, should be declared in a file named x1.java
public class x1{
       ^
C1.java:9: error: interface X2 is public, should be declared in a file named X2.java
public interface X2{
       ^
C1.java:13: error: interface c2 is public, should be declared in a file named c2.java
public interface c2{
       ^
3 errors