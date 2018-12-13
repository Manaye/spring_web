package com.firstwebapp.practice.spring;
import javax.persistence.*;


@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

}
