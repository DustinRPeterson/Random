package self.drp;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        try {
            ServerSocket serverSocket = new ServerSocket(4415);
            System.out.println("Waiting for a client");
            Socket socket = serverSocket.accept();
            System.out.println("Client Accepted");
            DataInputStream in = new DataInputStream(socket.getInputStream());

            String str =(String)in.readUTF();
            System.out.println(str);




            socket.close();
            in.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }





    }
}
