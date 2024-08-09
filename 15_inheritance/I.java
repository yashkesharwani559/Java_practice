interface A{}

interface B{

}

class C{

}

class I extends C implements A,B{

}
//this will give no error because java support multiple inheritance of interfaces with one class(inherited) 