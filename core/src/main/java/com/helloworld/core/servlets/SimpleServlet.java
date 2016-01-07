package com.helloworld.core.servlets;

import org.apache.felix.scr.annotations.Service;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@SuppressWarnings("serial")
@Service
@SlingServlet(resourceTypes = "/HelloWorld" , methods = "GET" , extensions = "html")
public class SimpleServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        resp.getOutputStream().println(resource.toString());
        resp.getOutputStream().println("Hello World");
    }
}
