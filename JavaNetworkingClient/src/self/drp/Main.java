package self.drp;

import java.io.*;
import java.net.*;

public class Main {



    public static void main(String[] args) {


        try {
            Socket socket = new Socket("127.0.0.1", 4415);
            System.out.println("Connected");
            DataInputStream in = new DataInputStream(System.in);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Hello Server");



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }
}
