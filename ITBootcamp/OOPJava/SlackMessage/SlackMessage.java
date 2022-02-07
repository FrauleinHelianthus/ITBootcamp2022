package SlackMessage;

import java.time.LocalDateTime;

public class SlackMessage {
    private String text;
    private String imePrezime;
    private LocalDateTime datumVreme = LocalDateTime.now();


    public SlackMessage(String text, String imePrezime) {
        this.text = text;
        this.imePrezime = imePrezime;


    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void stampaj() {
        System.out.println(this.imePrezime + " " + datumVreme);
        System.out.println(this.text);
        System.out.println();
    }


}
