package OOP.Abstraction.Shapes;

// Interface
interface Resizable {
    void resize(double factor);
    //In Java interfaces, methods are implicitly public and abstract (except for static and default (concrete) methods),So
    //no need to use public and abstract keywords.
    // and variables are implicitly public, static, and final.


    // above method is equivalent to:
    // public abstract void resize(double factor);

}

