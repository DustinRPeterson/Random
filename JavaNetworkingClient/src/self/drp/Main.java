package self.drp;

import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try {
            Socket echoSocket = new Socket("127.0.0.1", 4415);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("echo: " + in.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
