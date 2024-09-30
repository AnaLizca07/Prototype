package org.prototype.Example_2.models;

import org.prototype.Example_2.interfaces.PrototypeAlbum;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an album with a name, artist, and list of songs.
 * It implements the PrototypeAlbum interface for cloning operations.
 */
public class Album implements PrototypeAlbum {
    private String name;
    private String artist;
    private List<String> songs;


    /**
     * Constructor for Album class.
     *
     * @param name The name of the album.
     * @param artist The artist of the album.
     */
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    /**
     * Adds a song to the album's list of songs.
     *
     * @param song The name of the song to be added.
     */
    public void addSong(String song){
        this.songs.add(song);
    }

    /**
     * Performs a shallow clone of the album.
     *
     * @return A shallow clone of the album.
     */
    @Override
    public PrototypeAlbum shallowClone() {
        try{
            return (PrototypeAlbum) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }

    /**
     * Performs a deep clone of the album.
     *
     * @return A deep clone of the album.
     */
    @Override
    public PrototypeAlbum deepClone() {
        Album clonedAlbum = new Album(name, artist);
        clonedAlbum.songs = new ArrayList<>(songs);
        return clonedAlbum;
    }

    /**
     * Getter for the album's name.
     *
     * @return The name of the album.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the album's name.
     *
     * @param name The new name of the album.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the album's artist.
     *
     * @return The artist of the album.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Setter for the album's artist.
     *
     * @param artist The new artist of the album.
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Getter for the album's list of songs.
     *
     * @return The list of songs in the album.
     */
    public List<String> getSongs() {
        return songs;
    }

    /**
     * Setter for the album's list of songs.
     *
     * @param songs The new list of songs for the album.
     */
    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    /**
     * Returns a string representation of the album.
     *
     * @return A string representation of the album.
     */
    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }
}
