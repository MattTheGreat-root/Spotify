package Spotify;

public class RegularBehavior implements UserBehavior {

    int playingLimit = 5;
    @Override
    public void createPlaylist(String Title, User Owner) {
        throw new InvalidOperationException("You are not allowed to create a playlist");
    }

    @Override
    public void playMusic(Music music) {

    }

    @Override
    public void buyPremium(User owner, int month) {

    }
}
