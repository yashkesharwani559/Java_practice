public class Q {
    public static void main(String[] args){
        String s = "         Yash is a boy        ";

        System.out.println(">" + s + "<");//>         Yash is a boy        <        
        System.out.println(">"+s.trim()+"<");//>Yash is a boy<

    }
}
//String trime()  ---> is an instance method in the String class that removes the useless whitespaces before and after the sentence
//but trim() method doesnot removes the spaces between the two words in the string