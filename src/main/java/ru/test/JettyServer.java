package ru.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class JettyServer {

    private Server server;

    public void start() throws Exception {
        server = new Server(8090);
        ServletContextHandler servletHandler = new ServletContextHandler(server, "/status");
        servletHandler.addServlet(StartPage.class, "/");
        server.start();
    }
}
