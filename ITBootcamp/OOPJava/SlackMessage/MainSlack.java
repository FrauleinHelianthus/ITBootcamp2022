package SlackMessage;

import java.time.LocalDateTime;

public class MainSlack {
    public static void main(String[] args) {

         SlackMessage p1 = new SlackMessage("ovo je poruka", "Jovan Jovanovic");
         SlackMessage p2 = new SlackMessage("ovo je poruka2", "Jovan Mihajlovic");

         p1.stampaj();
         p2.stampaj();


    }
}
