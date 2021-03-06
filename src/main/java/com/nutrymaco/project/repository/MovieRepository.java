package com.nutrymaco.project.repository;
import com.nutrymaco.orm.generator.annotations.Repository;
import com.nutrymaco.orm.query.Query;
import com.nutrymaco.project.records.MovieRecord;

import java.util.List;

import static com.nutrymaco.project.fields._Movie.MOVIE;
import static com.nutrymaco.project.fields._Movie.MOVIE_ENTITY;

@Repository
public interface MovieRepository {

    List<MovieRecord> getByYear(int year);

    default List<MovieRecord> getByActorName(String actorName) {
        return Query.select(MOVIE_ENTITY)
                .where(MOVIE.ACTOR.NAME.eq(actorName))
                .fetchInto(MovieRecord.class);
    }

}
