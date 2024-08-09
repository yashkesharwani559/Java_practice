public class K extends A {
    void pro(){}//default
}

class A{
    void pro(){}//default
}

//no error 

//we can change access modifier on overridden method version but the new access modifier must have equal or wider range than the access modiier that is applied on the overriding method (parent class method) version