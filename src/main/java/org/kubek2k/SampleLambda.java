package org.kubek2k;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import com.amazonaws.services.lambda.runtime.Context;

public class SampleLambda {
    public String handleRequest(HashMap request, Context context) throws IOException {
        final Properties properties = new Properties();
        properties.load(SampleLambda.class.getResourceAsStream("/env.properties"));
        context.getLogger().log("A from properties == " +  properties.get("A"));
        context.getLogger().log("Even more new version");
        context.getLogger().log("Got a request of a form " + request);
        // Return a string to the caller
        return "SUCCESS!";
    }
}
