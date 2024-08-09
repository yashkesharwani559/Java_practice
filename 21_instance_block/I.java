class I {
    {
        System.out.println("J");
    }

    static {
        System.out.println("W");
    }

    {
        System.out.println("X");
    }    
    
    I() {
        System.out.println("G");
    }

    static {
        System.out.println("A");
    }
    
    public static void main(String[] args) {
        System.out.println("E");
        I m = new I();
        System.out.println("Z");
    }

    {
        System.out.println("T");
    }
    
    static {
        System.out.println("N");
    }
}

//this will give output as
// W 
// A 
// N 
// E
// J 
// X 
// T 
// G 
// Z 