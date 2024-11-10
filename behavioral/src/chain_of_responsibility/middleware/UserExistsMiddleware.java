package chain_of_responsibility.middleware;

import chain_of_responsibility.server.Server;

/**
 * ユーザーの認証情報の確認
 */
public class UserExistsMiddleware extends Middleware { 
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registerd!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
