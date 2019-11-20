package geek.less2.puzikov.Server.auth;

import jdk.internal.jline.internal.Nullable;

public interface AuthService {
    void start();
    void stop();

    @Nullable
    String getNickyLogiPass(String login, String pass);
}
