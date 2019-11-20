package geek.less2.puzikov.Server;

import java.net.ServerSocket;

public class ServerMai {
    private static final int PORT = 8189;


    private ServerSocket serverSocket = null;
    ServerMai(){
        System.out.println("Server is running");
        try {
            serverSocket = new ServerSocket(PORT);

        }
    }

}
