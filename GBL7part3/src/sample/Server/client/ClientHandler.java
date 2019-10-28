package sample.Server.client;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sample.Server.MyServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private MyServer myServer;
    private String clientName;
    private Socket socket;
    private DataOutputStream in;
    private DataOutputStream out;

    public ClientHandler(Socket socket, MyServer myServer) {
        try {
            this.socket = socket;
            this.myServer = myServer;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    authentication();
                    readMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    closeConnection();
                }
            }).start();
        } catch (IOException e) {
            throw new RuntimeException("Failed to create client handler", e);
        }
    }

    private void readMessage() {
        while (true) {
            String clientMessage = in.readUTF();
            System.out.println("Message '%s' from client %%n", clientMessage, clientName);
            if (clientMessage.equals("/end")) {
                return;
            }
            myServer.broadcastMessage(clientName + ": " + clientMessage);
        }
    }

    private void closeConnection() {
        myServer.unsubscribe(this);
        myServer.broadcastMessage(clientName + "is offline");
        try {
            socket.close();
        } catch (IOException e) {
            System.out.println("Failed to close socket!");
            e.printStackTrace();
        }
    }

    public void authentificacion() throws IOException {
        String clientMessage = in.readUTF();
        if (clientMessage.startsWith("/auth")) {
            String[] loginAndPasswords = clientMessage.split("\\s+");
            String login = loginAndPasswords[1];
            String password = loginAndPasswords[2];

            String nick = myServer.getAuthservice().getNickByLoginPass(login, password);
            if (nick == null) {
                sendMessage("nevernii login $$ % password");
                return;
            }
            if (myServer.isNickBusy(nick)) {
                sendMessage("Uchetnaja zapis ispolzuetsa");
                return;
            }
            sendMessage("/authok" + nick);
            clientMessage = nick;
            myServer.broadcastMessage(clientName + "is online");
            myServer.subscrible(this);
        }
    }


    public void sendMessage(String messsage) {
        try {
            out.writeUTF(messsage);
        } catch (IOException e) {
            System.err.println("Failed to send message to user " + clientName + " : " + messsage);
            e.printStackTrace();
        }
    }

    public Object getClientMame() {
        return clientName;
    }
}

