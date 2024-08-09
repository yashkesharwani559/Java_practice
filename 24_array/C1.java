public class C1 {
    public static void main(String[] args) {
        //case 1
        // BDog[] x = new Animal[3];

        // Case 2
        BDog[] x = (BDog) new Animal[3];
    }
}

//case 1
// this will give compilation error as
// C1.java:4: error: incompatible types: Animal[] cannot be converted to BDog[]
//         BDog[] x = new Animal[3];
//                    ^
// 1 error

//case 2
// this will give compilation error as
// C1.java:4: error: incompatible types: Animal[] cannot be converted to BDog[]
//         BDog[] x = new Animal[3];
//                    ^
// 1 error

