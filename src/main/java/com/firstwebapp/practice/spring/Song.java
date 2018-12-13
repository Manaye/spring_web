package com.firstwebapp.practice.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int length;
    private String title;
    private int trackNumber;


    public Song(String title, String artist, int trackNumber, int length, String imageUrl){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

       public String toString(){
        return this.title;
    }

}
