class C {
    public static void main(String[] args) {
        Z2 z = new Z2();
        System.out.println(z.y);
        // to access another class static variables we use
        // class-name.member-name
    }
}

class Z2 {
    int y = 345;
}
