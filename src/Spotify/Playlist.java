package Spotify;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playlist =  new ArrayList<>();
    private User owner;


    public Playlist(String title, User owner) {
        setTitle(title);
        setOwner(owner);
    }

    public void editTitle(String title, String password) {
        if (owner.getPassword().equals(password)) {
            if (title != null) {
                setTitle(title);
            } else throw new InvalidOperationException("Playlist title cannot be null");
        } else throw new InvalidOperationException("Incorrect password");
    }

    public void addMusic(Music music, String password) {
        if (owner.getPassword().equals(password)) {
            if (!playlist.contains(music)) {
                playlist.add(music);
            } else throw new InvalidOperationException("Playlist already contains music " + music);
        } else throw new InvalidOperationException("Incorrect password");
    }

    public void removeMusic(Music music, String password) {
        if (owner.getPassword().equals(password)) {
            if (playlist.contains(music)) {
                playlist.remove(music);
            } else throw new InvalidOperationException("Playlist does not contain music " + music);
        } else throw new InvalidOperationException("Incorrect password");
    }

    public String getTitle() {
        return title;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Music> searchInPlaylist(String title) {
        ArrayList<Music> ret = new ArrayList<>();
        for (Music music : playlist) {
            if (music.title.equals(title)) {
                ret.add(music);
            }
        }
        if (ret.isEmpty()) return null;
        else return ret;
    }

    public Music searchInPlaylist(String title, String artist) {
        for (Music music : playlist) {
            if (music.title.equals(title) && music.singer.getUserName().equals(artist)) {
                return music;
            }
        }
        return null;
    }

    public void playPlaylist() {
        for (Music music : playlist) {
            System.out.println("Playing: " + music);
        }
    }
}
