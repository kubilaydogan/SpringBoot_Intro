package ConstructorInjection.JavaAnnotations;

import dependency.Bread;
import dependency.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
    Example with two constructors ***
    When we have a class with multiple constructors,
    we need to explicitly add the @Autowired annotation
    to any one of the constructors so that Spring knows
    which constructor to use to inject the dependencies.

 */

@Component
public class Sandwich {

    private Topping toppings;
    private Bread breadType;

    Sandwich(Topping toppings) {
        this.toppings = toppings;
    }

    @Autowired
    Sandwich(Topping toppings, Bread breadType) {
        this.toppings = toppings;
        this.breadType = breadType;
    }

    public Topping getToppings() {
        return toppings;
    }

    public Bread getBreadType() {
        return breadType;
    }
}
