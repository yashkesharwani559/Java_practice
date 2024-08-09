import java.util.ArrayList;

class A2{
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.isEmpty();
        list.size();
        list.get(0);
        list.remove(0);
        //all above will give no warning
    }
}
//means if we try to add/store/insert/update elements in the typesafe class and not using it typesafely, will give a warning
// and any operation other than this will don't give any warning
