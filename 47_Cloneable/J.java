public class J {
    public static void main(String[] args) {

        AI a1 = new AI("vinay", 45);

        AI a2 = a1.createClone();

        System.out.println(a1 == a2);
        a2.name = "tarun";

        System.out.println(a1.name);
        System.out.println(a2.name);

    }
}
//output
// false
// vinay
// tarun


class AI implements Cloneable {
    String name;
    int age;

    AI(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public AI createClone() {
        AI e = null;

        try{
            e = (AI) this.clone();
        }catch(CloneNotSupportedException e1){
            e1.printStackTrace();
        }

        return e;
    }
}
