import java.net.*;
import java.io.*;

public class DateServer {
    public static void main(String[] args) {
        try {
            // Create a server socket on port 6013
            ServerSocket sock = new ServerSocket(7000);
            System.out.println("socket created");

            // Listen indefinitely for connections
            while (true) {
                Socket client = sock.accept(); // Accept client connection

                // Create a PrintWriter to send data to the client
                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);

                // Send current date and time
                //pout.println(new java.util.Date().toString());
                pout.println("hello");
                System.out.println("Client Connected");

                // Close connection with client
                client.close();
                //break;
            }
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}