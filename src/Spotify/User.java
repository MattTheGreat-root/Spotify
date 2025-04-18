package Spotify;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    private ArrayList<Playlist> playlists = new ArrayList<>();
    public static ArrayList<User> allUsers = new ArrayList<>();
    private UserBehavior behavior;

    public User(String username, String password) {
        setUserName(username);
        setPassword(password);
        setBehavior(new RegularBehavior());
        allUsers.add(this);
    }

    public void follow (User user){
        this.followingList.add(user);
        user.followerList.add(this);
    }

    public void createPlaylist (String title){
        this.behavior.createPlaylist(title, this);
    }

    public void playMusic (Music music){
        this.behavior.playMusic(music);
    }

    public void buyPremium (int month){
        this.behavior.buyPremium(this, month);
    }

    public Playlist getPlaylist(String title){
        for(Playlist playlist : playlists){
            if(playlist.getTitle().equals(title)){
                return playlist;
            }
        }
        return null;
    }

    public void setUserName(String username){
        if (username != null) {
            for (User u : allUsers) {
                if (u.username.equals(username)) {
                    throw new InvalidOperationException("Username already exists");
                }
            }
            this.username = username;
        } else throw new InvalidOperationException("Username cannot be empty");
    }

    public void setPassword(String password){
        if (password.length() > 7) {
            this.password = password;
        }
        else throw new InvalidOperationException("Password must have at least 8 characters");
    }

    public void setBehavior(UserBehavior behavior){
        this.behavior = behavior;
    }

    public String getUserName(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public UserBehavior getBehavior(){
        return this.behavior;
    }

    public void addPlaylist (Playlist playlist){
        this.playlists.add(playlist);
    }

    @Override
    public String toString() {
        return username;
    }
}
