package com.nutrymaco.project.config;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.nutrymaco.orm.config.Configuration;
import com.nutrymaco.orm.query.Database;

import java.util.List;

public class OrmConfiguration implements Configuration {
    @Override
    public Database database() {
        CqlSession session = CqlSession.builder().build();
        return query -> {
            System.out.println(query);
            try {
                ResultSet rs = session.execute(query);
                return rs.all();
            } catch (Exception ignored) {

            }
            return List.of();
        };
    }

    @Override
    public CqlSession session() {
        return CqlSession.builder().build();
    }

    @Override
    public String packageName() {
        return "com.nutrymaco.project";
    }

    @Override
    public boolean accessToDB() {
        return true;
    }

}
