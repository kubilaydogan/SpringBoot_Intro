package AnotherExample;

class A {
    public int a = 0;
    public int getA() {
        System.out.println("getA() method");
        return a;
    }
    public void setA(int aa) {
        if(!(aa > 10))
            a = aa;
    }
}
public class B {
    public static void main(String[] args) {
        A aObject = new A();
        aObject.a = 100;        // Not suppose to happen as defined by class A, this causes tight coupling.
        System.out.println("aObject.a value is: " + aObject.a);
    }
}

/*
    Tight coupling means classes and objects are dependent on one another.

    It reduces the flexibility and re-usability of the code. It makes changes much more difficult.
    The tightly coupled object is an object that needs to know about other objects
    and is usually highly dependent on each other's interfaces.

    In the above example, the code uses tight coupling.
    Class B knows about the detail of class A, if class A changes the variable 'a' to private
    then class B breaks, also class A's implementation states that variable 'a' should not be
    more than 10 but as we can see there is no way to enforce such a rule as we can go directly
    to the variable and change its state to whatever value we decide.


 */