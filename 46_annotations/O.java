public class O extends OO {
    public static void main(String[] args) {
        Integer i = new Integer(28);
    }
}

@SuppressWarnings("deprecation")
class OO{
    Integer w = new Integer(78);
}

//here this will give deprecation warning
// which means that annotations doesnot follow inheritance, means parent class annotation has no relation with the child class.