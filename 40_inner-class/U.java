class U{
    class X{
        int x;//allowed
        // static int y;//not allowed 
        static final int z = 12;//allowed

        void pro() {//allowed
        }

        // static void mno() {}//not allowed
        // static final void onm() {}//not allowed
    }
}
// so in jdk 11 and before versions of java inner class has a rule for static members in the inner class. But later on this rule is corrected in the jdk 17

// In jdk 11, what are the rules:
// static members(static methods and static variables) in the inner class are not allowed
// static variables are allowed if they are marked both 'static final'.
// means inner class can't have static methods.

// In jdk 17:-
// both static and non-static members can be created inside the inner class.
// means jdk 17 has overcome the faults of jdk 11.