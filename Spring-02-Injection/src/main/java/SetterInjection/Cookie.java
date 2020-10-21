package SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dependency.Topping;

@Component
public class Cookie {

    private Topping toppings;

    @Autowired
    void setTopping(Topping toppings) {
        this.toppings = toppings;
    }

    public Topping getTopping() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Cookie [toppings=" + toppings + "]";
    }

}