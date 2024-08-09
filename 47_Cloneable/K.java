public class K {
    public static void main(String[] args) {

        AK a1 = new AK("vinay", 45);

        AK a2 = a1.clone();

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


class AK implements Cloneable {
    String name;
    int age;

    AK(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public AK clone() {
        AK a = null;

        try{
            a = (AK) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        return a;
    }

}
