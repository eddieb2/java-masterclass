package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Song1", 4.6);
        album.addSong("Song2", 4.1);
        album.addSong("Song3", 4.3);
        album.addSong("Song4", 4.65);
        album.addSong("Song5", 5.6);
        album.addSong("Song6", 44.6);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("Song1", 3.04);
        album.addSong("Song2", 5.01);
        album.addSong("Song3", 5.3);
        album.addSong("Song4", 11.65);
        album.addSong("Song5", 5.6);
        album.addSong("Song6", 44.6);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();

        albums.get(0).addToPlaylist("Song1", playlist);
        albums.get(0).addToPlaylist("Song2", playlist);
        albums.get(0).addToPlaylist("Song10", playlist); // Test for error , doesn't exist
        albums.get(0).addToPlaylist(5, playlist);  // Test other method

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have rteached the end of the playlist");
                        forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }

                    break;
//                case 3:
//                    break;
//                case 4:
//                    printList(playlist);
//                case 5:
//                    printMenu();
//                    break;
            }
        }
    }
}
