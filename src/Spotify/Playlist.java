package Spotify;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playlist =  new ArrayList<>();
    private User owner;

    public Playlist(String title, User owner) {}

    public void editTitle(String title) {}

    public void addMusic(Music music) {}

    public void removeMusic(Music music) {}

}
