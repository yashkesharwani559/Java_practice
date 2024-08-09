public class B1 {
    public static void main(String[] args) {
        
        System.out.println(1);

        catch(Exception e){
            System.out.println(2);
        }
        
    }
}

//this will give compilation error because 
// catch cannot be written without try block

//compilation error
// B1.java:6: error: 'catch' without 'try'
//         catch(Exception e){
//         ^
// 1 error
// error: compilation failed