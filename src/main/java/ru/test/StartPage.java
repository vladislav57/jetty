package ru.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class StartPage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        BufferedReader br = new BufferedReader(new InputStreamReader(classloader.getResourceAsStream("Hello.html")));
        PrintWriter pw = response.getWriter();
        String line = null;
        while((line = br.readLine()) != null) {
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
