abstract class K1{
    {
        //instance block
    }
}
//this above will give no error because it is valid to write instance block inside an abstract class in java
//we know that access modifiers are not applicable for instance blocks but we can say that instance block can be accessible to constructor only of that class so we can take it as private but in reality no access modifier is applied on it because instance block is accessible to the constructor only