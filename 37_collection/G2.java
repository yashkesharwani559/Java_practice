import java.util.TreeMap;

public class G2 {
    public static void main(String[] args) {
        
        TreeMap<Student, College> map = new TreeMap<Student, College>();
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
                 
        System.out.println(map.firstKey());//ehom$19
        System.out.println(map.lastKey());//wom$20

    }    
}

class Student implements Comparable<Student>{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + "$" + age;
    }

    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
}

class College{
    String name;

    College(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
