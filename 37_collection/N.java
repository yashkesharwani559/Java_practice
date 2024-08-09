import java.util.ArrayList;
import java.util.Collections;
 
public class N {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("rohan", 21));
        arr.add(new Student("sohan", 18));
        arr.add(new Student("tohan", 23));
        arr.add(new Student("gohan", 22));
        arr.add(new Student("johan", 19));
        arr.add(new Student("kohan", 20));

        System.out.println(arr);

        Collections.sort(arr);//compilation fail because Student didn't implements the Comparable interface
        // and because here we have given typesafety to the ArrayList

        System.out.println(arr);

    }
}

class Student {
    String name; 
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + "$" + age;
    }
}
//  Collections.sort(arr);//compilation fail because Student didn't implements the Comparable interface
//                    ^
//     method Collections.<T#1>sort(List<T#1>) is not applicable
//       (inference variable T#1 has incompatible bounds
//         equality constraints: Student
//         lower bounds: Comparable<? super T#1>)
//     method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
//       (cannot infer type-variable(s) T#2
//         (actual and formal argument lists differ in length))
//   where T#1,T#2 are type-variables:
//     T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
//     T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
// 1 error
// error: compilation failed