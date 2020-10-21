package ConstructorInjection.JavaAnnotations;

import java.util.Objects;

import dependency.Flavor;
import org.springframework.stereotype.Component;

// In constructor-based injection, the dependencies required for the class
// are provided as arguments to the constructor:

@Component
public class Cake {

    private Flavor flavor;

    Cake(Flavor flavor) {
        Objects.requireNonNull(flavor);     // // NullPointerException – if obj is null
        this.flavor = flavor;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return "Cake [flavor=" + flavor + "]";
    }


}