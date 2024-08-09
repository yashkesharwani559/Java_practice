public class D {
    void pro(){
        class X{
            static int x = 56;//not allowed
            static final int y = 56;//allowed

            static void pro() {//not allowed
                System.out.println("hello");
            }
            static final void pro() {//not allowed
                System.out.println("hello");
            }

        }
    }
}
// so in jdk 11 and before versions of java method local inner class has a rule for static members in the inner class. But later on this rule is corrected in the jdk 17

// In jdk 11, what are the rules:
// static members(static methods and static variables) in the method local inner class are not allowed
// static variables are allowed if they are marked both 'static final'.
// means inner class can't have static methods.
// these all above are there in the jdk 11 but is gets updated (corrected) in the jdk 17

// In jdk 17:-
// both static and non-static members can be created inside the inner class.
// means jdk 17 has overcome the faults of jdk 11.
