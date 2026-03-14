package com.mysite.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
        name = "Hello Service Configuration",
        description = "Configuration for the Hello Service"
)
public @interface HelloServiceConfig {

    @AttributeDefinition(name = "Person Name")
    String personName() default "World";

    @AttributeDefinition(name = "Hello Prefix")
    String helloPrefix() default "Hello";

    @AttributeDefinition(name = "Service Enabled")
    boolean serviceEnabled() default true;
}

