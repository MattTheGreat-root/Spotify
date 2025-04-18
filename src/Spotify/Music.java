package Spotify;

import java.util.ArrayList;

public class Music {
    public String title;
    public User singer;
    public int numberOfStream;
    public static ArrayList<Music> allMusics = new ArrayList<Music>();

    public Music(String title, User singer) {
        this.title = title;
        this.singer = singer;
        this.numberOfStream = 0;
        allMusics.add(this);
    }


    public static void play(Music music) {
        System.out.println("Playing: " + music);
        music.numberOfStream += 1;
    }

    @Override
    public String toString() {
        return title + " By " + singer + "...";
    }

    public static ArrayList<Music> search(String title) {
        ArrayList<Music> ret = new ArrayList<Music>();
        for (Music music : allMusics) {
            if (music.title.equals(title)) {
                ret.add(music);
            }
        }
        if (ret.isEmpty()) {
            return null;
        }
        return ret;
    }

    public static Music search(String title, String artist) {
        for (Music music : allMusics) {
            if (music.title.equals(title) && music.singer.getUserName().equals(artist)) {
                return music;
            }
        }
        return null;
    }
}
