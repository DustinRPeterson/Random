package self.drp;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(4415);
            Socket clientSocket = serverSocket.accept();
            System.out.println("Server is running...");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
