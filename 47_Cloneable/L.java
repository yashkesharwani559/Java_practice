public class L {
    public static void main(String[] args) {

        Employee e1 = new Employee("arun", 43, "MTech", 200000);

        Employee e2 = e1.clone();

        System.out.println(e2 == e1);
        System.out.println(e2.name);
        System.out.println(e1.name);

    }
}
//here the parent class is not Cloneable but the child class is Cloneable and we are cloning the object of the child class using the clone() method. 
// means child class object can be deep cloned even when the parent class is not cloneable. This is because really the object is of the parent class and that's why it is allowed.

// Deep cloning :- creating a new object with same values of the variables

//output
// false
// arun
// arun

class User {
    String name;
    int age;

    User(String n, int a) {
        name = n;
        age = a;
    }
}

class Employee extends User implements Cloneable{
    String designation;
    int salary;

    Employee(String n, int a, String d, int s){
        super(n, a);
        designation = d;
        salary = s;
    }
    public Employee clone(){
        Employee emp = null;

        try{
            emp = (Employee) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return emp;
    }
}