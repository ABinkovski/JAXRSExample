package com.edu;

import com.edu.services.HelloService;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class RestfulServer {
    public static void main(String[] args) {
        final JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(HelloService.class);

        factoryBean.setResourceProvider(new SingletonResourceProvider(new HelloService()));

        factoryBean.setAddress("http://localhost:8080/");

        final Server server = factoryBean.create();


    }
}
