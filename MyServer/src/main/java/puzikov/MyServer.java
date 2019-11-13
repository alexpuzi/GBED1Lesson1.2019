package puzikov;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private  static final int PORT = 8189;
    private AuthService authService;

    public MyServer(){
        System.out.println("Server start...");
        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            AuthService authService = new BaseAuthService();
            while (true) {
                System.out.println("Awaiting client connection...");
                Socket socket = new serverSocket.accept();
                System.out.println("Client has connected");

            }
        }catch (IOException e){
            System.err.println("Error in work of server:"+e.getMessage());
            e.printStackTrace();
        }
    }


}
}