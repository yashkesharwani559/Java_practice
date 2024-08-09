interface U1{
    int y = 34;
}

class U implements U1{
    public static void main(String[] args){
        System.out.println(U.y);
        System.out.println(U1.y);

    }
}