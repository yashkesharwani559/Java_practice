
// Object class is the ultimate parent of all classes in java
// if we didn't create a class1 as parent class of class2 then a predefined
// Object class is the parent of each class
// summary by default parent of each class is the Object class
// there is no parent class of Object class in java
// all predefined and userdefined classes are child of the Object class
class F1 extends Object {// this syntax is correct
    // public static void main(String[] x){}//here i have written x in place of args
    // and it is a valid code because we can change the name of parameter variable
    // in java and this is the only thing we can change in this line
    // there cannot be two methods with same name in java
    // public static void main(String[] args) {}//this is a recommended correct line
    static public void main(String[] args) {
        System.out.println("Hello");
    }// this is also a valid line, because static and public are modifiers in java
     // and we can change the order of modifier of methods in java
}
// Object class is a predefined class in java
// there are 11 methods declared in Object class in java in which 1 class from
// them is depreciated and its name is finalise()