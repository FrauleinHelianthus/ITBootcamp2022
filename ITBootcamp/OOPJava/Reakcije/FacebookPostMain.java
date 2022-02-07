package Reakcije;

public class FacebookPostMain {
    public static void main(String[] args) {


        FacebookPost post = new FacebookPost("Jelena Zdravkovic", "He he");
        post.reaguj("Jelena", "Smajli");
        post.reaguj("Milos", "Srce");
        post.reaguj("Jovanka", "Lajk");
        post.reaguj("Persida", "Lajk");

        post.stampaj();


    }
}
