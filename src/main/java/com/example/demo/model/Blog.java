package com.example.demo.model;

import java.time.LocalDate;

public class Blog {
    private Integer id;
    private String name;
    private String text;
    private LocalDate creationDate;
    private LocalDate updateDate;
    private Integer tag;
    private String author;

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getText(){
        return text;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getUpdateDate(){
        return updateDate;
    }

    public Integer getTag(){
        return tag;
    }

    public String getAuthor(){
        return author;
    }





    public void setId(Integer id){
        this.id = id;
    }

}
