
@FunctionalInterface
interface FF{
    void pro();
}

@FunctionalInterface
interface F extends FF{
    void pro();
}

// correct because the pro() method of the FF interface is overridden in the F interface