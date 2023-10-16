package com.zoomcar;

import com.zoomcar.resources.HelloWorldResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class sandboxApplication extends Application<sandboxConfiguration> {

    public static void main(final String[] args) throws Exception {
        new sandboxApplication().run(args);
    }

    @Override
    public String getName() {
        return "sandbox";
    }

    @Override
    public void initialize(final Bootstrap<sandboxConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final sandboxConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }

}
