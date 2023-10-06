package com.iuh.phu.se.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public abstract class AbtrastDao<T,ID>{
    protected DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbtrastDao(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate =new JdbcTemplate(dataSource);
    }

    public abstract void add(T t);

    public abstract void update(T t);

    public abstract void delete(ID id);

    public abstract T findById(ID id);

    public abstract List<T> getAll();
}
