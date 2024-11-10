import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import chain_of_responsibility.middleware.Middleware;
import chain_of_responsibility.middleware.RoleCheckMiddleware;
import chain_of_responsibility.middleware.ThrottlingMiddleware;
import chain_of_responsibility.middleware.UserExistsMiddleware;
import chain_of_responsibility.server.Server;

public class ChainOfResponsibilityDemo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");


        Middleware middleware = Middleware.link
        (
            new ThrottlingMiddleware(2), 
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Inputpassword: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
