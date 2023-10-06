package com.iuh.phu.se.dao;

import com.iuh.phu.se.models.Job;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class JobDao extends AbtrastDao<Job, Long> {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public JobDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void add(Job job) {
        String query = "insert into job value (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, job.getJob_id(), job.getJobTitle(), job.getDescripttion(), job.getLocation(), job.getSalary(), job.getCandidate().getCant_id());

    }

    @Override
    public void update(Job job) {
        String query = "update job set jobTitle = ?, descripttion = ?, location = ?, salary = ?,can_id = ?  where job_id = ?";
        jdbcTemplate.update(query, job.getJobTitle(), job.getDescripttion(), job.getLocation(), job.getSalary(), job.getCandidate(),job.getJob_id());
    }

    @Override
    public void delete(Long id) {
        String query = "delete from job where job_id = ?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public Job findById(Long id) {
        String sql = "select * from job where job_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Job.class), id);
    }

    @Override
    public List<Job> getAll() {
        String sql = "select * from job";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Job.class));
    }

    public void addWithSetter(Job job, PreparedStatementSetter preparedStatementSetter) {
        String query = "insert into job value (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, preparedStatementSetter);
    }
}
