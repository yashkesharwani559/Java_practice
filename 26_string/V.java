public class V {
    public static void main(String[] args){
        String s = "He is a good boy";

        char[] a = s.toCharArray();

        char[] temp = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            temp[temp.length - i - 1] = a[i];
        }
        
        System.out.println(s);//He is a good boy
        s = String.valueOf(temp);
        System.out.println(s);//yob doog a si eH
    }
}
