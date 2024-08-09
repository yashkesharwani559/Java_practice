public class Y1 {
    Y1.R pro() {//compilation fail because we can use the local class inside the method only
        class R {

        }
       return new R(); 
    }
}
