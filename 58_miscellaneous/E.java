public class E {
    public static void main(String[] args){
        Object o = "33" + 2;
        Object o1 = 33 + 2;
        System.out.println(o instanceof String);
        System.out.println(o1 instanceof Integer);

    }
}

//typeof operator doesnot exist in java
// but instanceof operator exist in java
