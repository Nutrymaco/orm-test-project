package com.nutrymaco.project.config;

import com.nutrymaco.orm.config.Configuration;

public class OrmConfiguration implements Configuration {

    @Override
    public String packageName() {
        return "com.nutrymaco.project";
    }

    @Override
    public boolean accessToDB() {
        return true;
    }

    @Override
    public boolean enableSynchronisation() {
        return false;
    }

}
