package sample.Server;

import sample.Server.auth.BaseAuthService;
import sample.Server.auth.AuthService;
import sample.Server.client.ClientHandler;
import sample.Server.client.BaseAuthService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import static sample.Server.auth.authService.*;

public class MyServer {
    private final static int PORT = 8189;
    private List<ClientHandler> clients = new ArrayList<>();
    private final AuthService authService = (AuthService) new BaseAuthService();

    public MyServer(){
        System.out.println("Server is running");
        try (ServerSocket serverSocket=new ServerSocket(PORT)){
            authService.start();
            while (true){
                System.out.println("Awaiting client connection...");
                Socket socket = serverSocket.accept();
                System.out.println("Client has connected");
                new ClientHandler(socket.this);

            }
        }catch (IOException e){
            System.err.println("Error in work of server..");
            e.printStackTrace();
        }finally{
            authService.stop();
        }
    }

    public synchronized void subscrible(ClientHandler clientHandler){
        clients.add(clientHandler);
    }
    public synchronized void unsubscrible(ClientHandler clientHandler){
        clients.remove(clientHandler);
    }
    public AuthService getAuthservice(){
        return authService;
    }
    public synchronized boolean isNickBusy(String nick){
        for (ClientHandler client : clients){
            if(client.getClientMame().equals(nick)){
                return true;
            }
        }
        return false;
    }

    public synchronized void broadcastMessage(String messsage){
        for (ClientHandler client : clients){
            client.sendMessage(messsage);
        }
    }
}
