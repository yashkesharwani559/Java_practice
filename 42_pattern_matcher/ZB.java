public class ZB {
    public static void main(String[] args) {

        String s = "mohan45 sohan23 gohan19 rohan78 tohan89 ";

        String[] arr = s.split("\\d{2} ");

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
// mohan45 sohan23 gohan19 rohan78 tohan89