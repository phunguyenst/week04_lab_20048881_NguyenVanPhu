package com.iuh.phu.se.dao;

import com.iuh.phu.se.models.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class CandidateDao extends AbtrastDao<Candidate, Long> {

    @Autowired
    public CandidateDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void add(Candidate candidate) {
        String query = "insert into Candidate values (?,?,?,?,?)";
        jdbcTemplate.update(query, candidate.getCant_id(), candidate.getFullName(), candidate.getEmail(), candidate.getPhone(), candidate.getAge());
    }


    @Override
    public void update(Candidate candidate) {
        String query = "update Candidate set fullName = ?, email = ?, phone = ?, age = ? where can_id = ?";
        jdbcTemplate.update(query, candidate.getFullName(), candidate.getEmail(), candidate.getPhone(), candidate.getAge(), candidate.getCant_id());

    }


    @Override
    public void delete(Long id) {
        String query = "delete from Candidate where can_id = ?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public Candidate findById(Long id) {
        String sql = "select * from Candidate where can_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Candidate.class),id );
    }

    @Override
    public List<Candidate> getAll() {
        String sql = "select * from Candidate";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Candidate.class));
    }
}
