package observer.listeners;

import java.io.File;

/**
 * 通知受付後、メールを送信
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file" + file.getName() );
    }
}
