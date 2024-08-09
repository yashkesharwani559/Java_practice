public class B {
    {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }
    
    B() {
        System.out.println("D");
    }

    public static void main(String[] args){
        B x = new B();
    }
    {
        System.out.println("C");
    }
}

//this will give output in order
// A
// B
// C
// D


//this shows that we can create multiple instance block but their priority at the time of calling is from top to bottom

//also at the time of running the instance initialization block(IIB) IIB don't get its frame to run in the stack but the code of the IIB runs from inside the constructor only 