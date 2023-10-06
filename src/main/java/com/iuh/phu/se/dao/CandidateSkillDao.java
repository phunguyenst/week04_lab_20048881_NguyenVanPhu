package com.iuh.phu.se.dao;

import com.iuh.phu.se.models.CandidateSkill;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CandidateSkillDao extends AbtrastDao<CandidateSkill, List<Long>> {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public CandidateSkillDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void add(CandidateSkill candidateSkill) {
        String sql = "insert into candidateskill values (?, ?, ?) ";
        jdbcTemplate.update(sql,candidateSkill.getCan_id(), candidateSkill.getJob_id(), candidateSkill.getLevel());
    }

    @Override
    public void update(CandidateSkill candidateSkill) {
        String query = "update candidateskill set level = ? where can_id = ? and skill_id = ?";
        jdbcTemplate.update(query, candidateSkill.getLevel(), candidateSkill.getCan_id(), candidateSkill.getJob_id());
    }

    @Override
    public void delete(List<Long> id) {
        String query = "delete from candidateskill where can_id = ? and skill_id = ? ";
        jdbcTemplate.update(query, id.get(0), id.get(1));
    }

    @Override
    public CandidateSkill findById(List<Long> longs) {
        String query = "select * from candidateskill where can_id = ? and skill_id = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(CandidateSkill.class), longs.get(0), longs.get(1));
    }


    public CandidateSkill findByCandidateId(Long id) {
        String query = "select * from candidateskill where can_id = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(CandidateSkill.class), id);
    }
    public CandidateSkill findBySkillId(Long id) {
        String query = "select * from candidateskill where skill_id = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(CandidateSkill.class), id);
    }

    @Override
    public List<CandidateSkill> getAll() {
        String sql = "select * from candidateskill";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CandidateSkill.class));
    }
}
