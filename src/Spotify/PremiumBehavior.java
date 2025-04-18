package Spotify;

public class PremiumBehavior implements UserBehavior {

    private int month;

    public PremiumBehavior(int month) {
        setMonth(month);
    }

    @Override
    public void createPlaylist(String title, User owner) {
        Playlist playlist = new Playlist(title, owner);
        owner.addPlaylist(playlist);
    }

    @Override
    public void playMusic(Music music) {
        Music.play(music);
    }

    @Override
    public void buyPremium(User owner, int month) {
        this.month += month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        else this.month = month;
    }
}
