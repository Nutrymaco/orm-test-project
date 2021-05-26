package com.nutrymaco.project.repository;
import com.nutrymaco.orm.generator.annotations.Repository;
import com.nutrymaco.orm.query.Query;
import com.nutrymaco.project.records.MovieRecord;

import java.util.List;

import static com.nutrymaco.project.fields._Movie.MOVIE;
import static com.nutrymaco.project.fields._Movie.MOVIE_ENTITY;

@Repository
public class MovieRepository {
    public List<MovieRecord> getMovieByYear(int year) {
        return Query.select(MOVIE_ENTITY)
                .where(MOVIE.YEAR.eq(year))
                .fetchInto(MovieRecord.class);
    }

    public List<MovieRecord> getMovieByActorName(String actorName) {
        return Query.select(MOVIE_ENTITY)
                .where(MOVIE.ACTOR.NAME.eq(actorName))
                .fetchInto(MovieRecord.class);
    }

    // показать, что при смене MOVIE.YEAR.eq(year) -> MOVIE.YEAR.ge(year) новая таблица не создается
    public List<MovieRecord> getMovieByYearAndActorName(int year, String actorName) {
        return Query.select(MOVIE_ENTITY)
                .where(MOVIE.YEAR.eq(year), MOVIE.ACTOR.NAME.eq(actorName))
                .fetchInto(MovieRecord.class);
    }
}
