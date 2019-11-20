package geek.less2.puzikov.Server.auth;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.security.KeyStore;

public class BaseAuthService implements AuthService {
    private static class Entry {


        private String login;
        private String password;
        private String nick;

        public Entry(String login, String password, String nick) {
            this.login = login;
            this.nick = nick;
            this.password = password;

        }

    }
    private final List<Entry> entryList = Array.asList(
            new Entry("login1","pass1","nick1"),
            new Entry("login2","pass2","nick2"),
            new Entry("login3","pass3","nick3"));

    public void start() {
        System.out.println("Auth servise is running");

    }

    public void stop() {
        System.out.println("Auth service is stopped");

    }

    public String getNickyLogiPass(String login, String pass) {
        for (Entry entry : entryList){
            if(entry.login.equals(login)&& entry.password.equals(pass)){
                return entry.nick;
            }
        }
        return null;
    }
}
