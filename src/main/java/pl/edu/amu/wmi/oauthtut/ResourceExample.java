package pl.edu.amu.wmi.oauthtut;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stworzone przez Eryk Mariankowski dnia 25.04.18.
 */
@RestController
public class ResourceExample {

    @RequestMapping("/resource")
    public String resource() {
        return "Resource";
    }

}
