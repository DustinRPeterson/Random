package self.drp;

import java.io.*;
import java.net.*;

public class Main {



    public static void main(String[] args) {

        String textFile = "src/self/drp/temp.txt";


        try {
            Socket socket = new Socket("127.0.0.1", 4415);
            System.out.println("Connected to server");
            DataInputStream in = new DataInputStream(System.in);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //out.writeUTF("Hello Server");

            FileReader fileReader = new FileReader(textFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                out.writeUTF(line);
            }

            fileReader.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }
}
