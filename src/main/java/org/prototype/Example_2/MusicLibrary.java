package org.prototype.Example_2;

import org.prototype.Example_2.models.Album;

/**
 * This class represents a music library containing albums.
 * It demonstrates the concept of shallow and deep cloning.
 */
public class MusicLibrary {

    /**
     * The main method to test the functionality of the MusicLibrary class.
     */
    public static void main(String[] args) {
        Album originalAlbum = new Album("Thriller", "Michael Jackson");
        originalAlbum.addSong("Billie Jean");
        originalAlbum.addSong("Beat It");

        Album shallowClone = (Album) originalAlbum.shallowClone();
        shallowClone.setName("Thriller - Special Edition");

        Album deepClone = (Album) originalAlbum.deepClone();
        deepClone.setName("Thriller - Remastered");
        deepClone.addSong("Thriller");

        originalAlbum.addSong("Wanna Be Startin' Somethin'");

        System.out.println("Original Album: \n" + originalAlbum);
        System.out.println("Shallow Clone: \n" + shallowClone);
        System.out.println("Deep Clone: \n" + deepClone);
    }
}