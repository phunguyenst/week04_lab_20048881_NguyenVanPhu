package com.iuh.phu.se.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Component
public abstract class AbtrastDao<T,ID>{


    public abstract void add(T t);

    public abstract void update(T t);

    public abstract void delete(ID id);

    public abstract T findById(ID id);

    public abstract List<T> getAll();
}
