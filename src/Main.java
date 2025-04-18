import Spotify.Music;
import Spotify.User;
//only for testing
public class Main {
    public static void main(String[] args) {
        User matin = new User("Matin", "Matin1385");
        User farid = new User("Farid", "Farid1385");
        User yas  = new User("Yas", "Yas1388885");
        matin.buyPremium(4);
        matin.createPlaylist("late night");
        matin.buyPremium(3);
        Music music1 = new Music("sarkoob", yas);
        Music music2 = new Music("mosafer", yas);
        Music.search("mosafer");
        matin.getPlaylist("late night").addMusic(music2, "Matin1385");
        matin.getPlaylist("late night").addMusic(music1, "Matin1385");

        matin.getPlaylist("late night").playPlaylist();
        matin.getPlaylist("late night").removeMusic(music1, "Matin1385");
        matin.getPlaylist("late night").playPlaylist();


    }
}