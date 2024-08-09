@FunctionalInterface
interface DD {
    void pro();
}

@FunctionalInterface
interface D extends DD {
}

//correct because the declared method of the interface DD is inherited in the interface EE and that's why EE also have one declared method which is inherited from the DD interface