import java.io.FileNotFoundException;

abstract class D {
    abstract void pro() throws FileNotFoundException;
}
//so we can write the throws statement in the absrtract method
//correct code not give any compilation error 
//but cannot run because main method is not there

