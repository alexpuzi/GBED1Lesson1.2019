package server4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;

        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server run, wait connecting");
            socket = serverSocket.accept();
            System.out.println("Client connected...");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String str = dataInputStream.readUTF();
                if (str.equals("/exit")) {
                    break;
                }
                System.out.println("Retvieved message:" + str);
                dataOutputStream.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}