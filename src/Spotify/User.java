package Spotify;

import java.util.ArrayList;

public class User {

    private String userName;
    private String password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    private ArrayList<Playlist> playlists = new ArrayList<>();
    public static ArrayList<User> allUsers = new ArrayList<>();
    private UserBehavior behavior;

    public User(String userName, String password, UserBehavior behavior) {}

    public void follow (User user){}

    public void createPlaylist (String title, User owner){
        this.behavior.createPlaylist(title, owner);
    }

    public void playMusic (Music music){
        this.behavior.playMusic(music);
    }

    public void buyPremium (User owner, int month){
        this.behavior.buyPremium(owner, month);
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setBehavior(UserBehavior behavior){
        this.behavior = behavior;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }
    public UserBehavior getBehavior(){
        return this.behavior;
    }
}
