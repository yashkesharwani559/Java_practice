public class A6 {
    public static void main(String[] args) {
        // float x = 3.34;//error because by default the point value is treated as a double value and a double cannot be stored in a float variable

        // float x = (float) 3.34;//correct
        // float x = 3.34f;//correct
        // System.out.println(x);

        float x = 334234423143223232323232323223234123423f;//a number float is greater than long can be stored to float because float has some constants to store the value

        // x = 3.234e38f;
        // System.out.println(x);//3.3423442E38

        // double y = 21354234156563425423523452353425235312454345231423454354635656545656654665654665656546565365654665466665466477878686774553454855476345234554375756744634565667232345234534654756773455647373432428754138752837578231587231875781235872238751237895789231578123587213785345345345334555467453434534345353434566546343d;//very large range of double

        
        // double y = -21354234156563425423523452353425235312454345231423454354635656545656654665654665656546565365654665466665466477878686774553454855476345234554375756744634565667232345234534654756773455647373432428754138752837578231587231875781235872238751237895789231578123587213785345345345334555467453434534345353434566546343d;
        // System.out.println(y);

        double d = 1.34;//correct
        d = 1.34e308;//correct
        System.out.println(d);
    }
}
