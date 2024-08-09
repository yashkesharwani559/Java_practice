
@FunctionalInterface
interface C1{
    void pro();
    default void mno(){
        System.out.println("default");
    }
}
// correct because here it has only one declared method and 
// basically functional interface can have any number of defined methods but it just have exactly one declared methods