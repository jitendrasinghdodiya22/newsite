package com.mysite.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class HelloModel {

    @ValueMapValue
    private String message;

    public String getMessage() {
        return message;
    }
}





