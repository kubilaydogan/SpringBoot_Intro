package ConstructorInjection.JavaSourceCode;

import microsoft.exchange.webservices.data.core.exception.misc.ArgumentNullException;

// Understanding Constructor Injection
// Injecting a Dependency using Constructor Injection
// The class that needs the Dependency must expose a public constructor
// that takes an instance of the required Dependency as a constructor argument.

class IProductService{

}
public class HomeController {

    private IProductService service;        // **

    public HomeController(IProductService service){
        if (service == null)                // Guard Clause to prevent clients from passing in null.
            throw new ArgumentNullException("service");
        this.service = service;             // **
    }
}

// ** Creating a private instance field to store the Dependency for later use.
// The constructor contains no other logic than verifying and storing its incoming Dependencies.




