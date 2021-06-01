package com.nutrymaco.project.impl;

import com.nutrymaco.orm.migration.TableSynchronizationStrategy;
import com.nutrymaco.orm.schema.db.Table;

public class TableSynchronizationStrategyImpl implements TableSynchronizationStrategy {
    @Override
    public boolean isSync(Table table) {
        return true;
    }

    @Override
    public void addTable(Table table) {

    }
}
