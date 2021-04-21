package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist, boolean addedSong) {
        this.name = name;
        this.artist = artist;

    }

    public boolean addSong(String titleOfSong, double initialDuration) {
        if(findSong(titleOfSong) == null) {
            this.songs.add(new Song(titleOfSong, initialDuration);
            return true;
        }
        return false;
    }

    private Song findSong(String titleOfSong) {
        for(int i=0; i<this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getTitle().equals(titleOfSong)) {
                return checkedSong;
            }
        }
        return null;
    }


}
