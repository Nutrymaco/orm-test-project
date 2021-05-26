package com.nutrymaco.project.model;

import com.nutrymaco.orm.generator.annotations.Entity;
import com.nutrymaco.orm.schema.db.annotations.Unique;

import java.util.List;

@Entity
public class Movie {
    @Unique
    int id;
    String name;
    int year;
    List<Actor> actors;
}
