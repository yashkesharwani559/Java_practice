public class E1 {
    public static void main(String[] args) {
        AAX1 obj = new AAX1() {//static method local anonymous inner class
            public void pro() {
                System.out.println(this);//E1$
            }
        };

        System.out.println(obj);
        obj.pro();

    }
}

interface AAX1{
    void pro();
}

// anonymous inner class is a class that is created like 
// syntax
// <parent-name> <variable-name> = new <parent-name>() {
    // define and override methods here
    // }
// its name is anonymous because the class has no name. 
// Anonynmous class can always created for a particular object.
// Anonymous inner class is always created from taking reference of the parent-class/interface.
// here the object is created of anonymous inner class and after that, this object is assigned to variable of the parent class. And that's why we can write <variable-name>.something only when something is declared in the parent interface.