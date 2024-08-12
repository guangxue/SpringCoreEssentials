package Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnyClass {

    public void AnyMethod() {
        System.out.println("@component called");
    }
}
