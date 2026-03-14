package com.mysite.core.services.impl;

import com.mysite.core.config.HelloServiceConfig;   // ← FILE 1
import com.mysite.core.services.HelloService;        // ← FILE 2
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = HelloService.class, immediate = true)
@Designate(ocd = HelloServiceConfig.class)
public class HelloServiceImpl implements HelloService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloServiceImpl.class);

    private String personName;
    private String helloPrefix;
    private boolean serviceEnabled;

    @Activate
    @Modified
    protected void activate(HelloServiceConfig config) {
        this.personName     = config.personName();
        this.helloPrefix    = config.helloPrefix();
        this.serviceEnabled = config.serviceEnabled();
        LOG.info("HelloService activated - Name:{}, Prefix:{}", personName, helloPrefix);
    }

    @Override
    public String getHello() {
        if (!serviceEnabled) {
            return "Service is disabled";
        }
        return helloPrefix + ", " + personName + "!";
    }

    @Override
    public boolean isEnabled() {
        return serviceEnabled;
    }
}
