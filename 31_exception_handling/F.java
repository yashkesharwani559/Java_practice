public class F {
    public static void main(String[] args){
        System.out.println(2);
        try{
            System.out.println(1);
            try{
                System.out.println(3);
                int x = 12/0;
            }catch(ArithmeticException e){
                System.out.println("AE");
            }finally{
                System.out.println(4);
                System.out.println("problem solved");
            }
        } catch (RuntimeException e) {
            System.out.println(5);
            try{
                System.out.println(6);
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException x) {
                System.out.println("NPE");
            } finally {
                System.out.println("7");
            }
        } finally {
            System.out.println(10);
            try{
                System.out.println(8);
                int a[] = new int[2];
                System.out.println(a[4]);
            } catch (Exception e) {
                System.out.println("AIOBE");
            } finally {
                System.out.println(9);
            }
        }
    }
}

//legal code 
//nested try-catch-finally is allowed in java