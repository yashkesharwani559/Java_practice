public class ZA {
    public static void main(String[] args) {
        String s = "mohan, sohan, gohan, rohan, tohan";

        String[] arr = s.split(", ");

        for (String st : arr) {
            System.out.println(st);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(s);
    }
}
//output
// mohan
// sohan
// gohan
// rohan
// tohan
// ~~~~~~~~~~~~~~~~~~~~
// mohan, sohan, gohan, rohan, tohan