interface Z{
    void abc();
}

class Y implements Z{
    void abc(){

    }
}

class X extends Y implements Z{
}
//we didnot get any error because method abc() is a force contract on X but abc() is already inherited from Y
// and we also know that a class can extend only one class at a time