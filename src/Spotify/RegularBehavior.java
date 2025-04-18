package Spotify;

public class RegularBehavior implements UserBehavior {
    //does it need constructor?
    int playingLimit = 5;
    @Override
    public void createPlaylist(String Title, User Owner) {
        throw new InvalidOperationException("You are not allowed to create a playlist");
    }

    @Override
    public void playMusic(Music music) {
        if (playingLimit > 0) {
            Music.play(music);
            playingLimit -= 1;
        }
        else throw new InvalidOperationException("Subscribe to premium to play more than 5 musics.");
    }

    @Override
    public void buyPremium(User owner, int month) {
        owner.setBehavior(new PremiumBehavior(month));
    }
}
