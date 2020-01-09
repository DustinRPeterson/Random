package self.drp;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        try {
            ServerSocket serverSocket = new ServerSocket(4415);
            System.out.println("Waiting for client connection");
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");
            DataInputStream in = new DataInputStream(socket.getInputStream());

            String str =(String)in.readUTF();
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/self/drp/output.txt"));
            writer.write(str);



            writer.close();
            socket.close();
            in.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }





    }
}
