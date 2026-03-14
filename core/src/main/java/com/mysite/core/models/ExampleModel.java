package com.mysite.core.models;

import com.mysite.core.services.HelloService;   // ← FILE 2
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables = SlingHttpServletRequest.class)
public class ExampleModel {

    @OSGiService
    private HelloService helloService;   // ← Inject FILE 2

    public String getMessage() {
        return helloService.getHello();  // Output → "Hello, John!"
    }
}
