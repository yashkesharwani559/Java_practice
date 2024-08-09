public class R {
    static void pro(String ...x){}//correct

    static void mno(String... x){}//correct

    static void pqr(String x...){}//not allowed

    static void pqr(...String x){}//not allowed
}
