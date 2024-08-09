//important for the basics that how string objects are created in java
 
public class T2 {
    public static void main(String[] args){
        
    }
}
//a concept with the string objects

//1.when string object is created like this
// String s = "yash";
//then the string object is created in the string constant pool and when new string with same value is created then same object reference code is assigned to that variable also and no new object is created in the string constant pool
// so this directly means that in the string constant pool there can be only those objects that have unique value
// and string constant pool is a part of the heap memory

// 2. when an string object is created like this 
// String s = new String("yash"); then here firstly a String object is created in the string constant pool with the value yash and then this object's reference code is assigned to the String class constructor as argument and then a new object is created in the non-string constant pool (other memory of heap instead of the string constant pool) and that object's reference code is assigned to the variable s
// so in this case two objects are created
// and if a new object is created like this having same value
// String s1 = new String("yash");
// then both s and s1 contains the reference code different object having same value and both objects are created in the non-string constant pool (other part of the heap).
