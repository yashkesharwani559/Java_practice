public class H extends A {
    D pro(){
        return null;
    }
}

class C{}

class D extends C{}

class A{
    C pro(){
        return null;
    }
}

//legal method overriding: because child class object can be assigned to the parent class variable and that's why it is valid to apply parent class return type to the parent class method version and the child class return type to the child class overridden method version

//no error