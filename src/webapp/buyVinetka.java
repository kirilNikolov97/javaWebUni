package webapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class buyVinetka extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int normalVinetka = 10;
        int truckVinetka = 20;
        int otherVinetka = 15;

        PrintWriter writer = response.getWriter();

        writer.print(request.getParameter("name") + " "
                + request.getParameter("numberVehicle") + " "
                + request.getParameter("typeVehicle") + "\n;");

        if(request.getParameter("typeVehicle").equals("normal")) {
            writer.print("\nPrice: " + normalVinetka);
        } else if(request.getParameter("typeVehicle").equals("truck")) {
            writer.print("\nPrice: " + truckVinetka);
        } else {
            writer.print("\nPrice: " + otherVinetka);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.print("The request: " + request.getParameter("name") + " "
                + request.getParameter("numberVehicle")+ " "
                + request.getParameter("typeVehicle"));
    }
}
