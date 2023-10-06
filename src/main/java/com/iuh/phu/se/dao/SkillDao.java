package com.iuh.phu.se.dao;

import com.iuh.phu.se.models.Skill;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class SkillDao extends AbtrastDao<Skill, Long> {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public SkillDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void add(Skill skill) {
        String query = "insert into Skill values (?, ?)";
        jdbcTemplate.update(query, skill.getSkill_id(), skill.getSkillName());
    }

    @Override
    public void update(Skill skill) {
        String query = "update Skill set skillName = ?, where skill_id = ?";
        jdbcTemplate.update(query, skill.getSkillName(), skill.getSkill_id());
    }

    @Override
    public void delete(Long id) {
        String query = "delete from Skill where skill_id = ?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public Skill findById(Long id) {
        String sql = "select * from Skill where skill_id = ? ";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Skill.class), id);
    }

    @Override
    public List<Skill> getAll() {
        String sql = "select * from Skill";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Skill.class));
    }
}
