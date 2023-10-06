package com.iuh.phu.se.nguyenvanphu_20048881_week4;

import com.iuh.phu.se.dao.CandidateDao;
import com.iuh.phu.se.models.Candidate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

import javax.sql.DataSource;

@SpringBootTest

class NguyenVanPhu20048881Week4ApplicationTests {

    @Autowired
   private CandidateDao candidateDao;

    @Test
    void text_insert() {

//        Candidate c = new Candidate(1, "Phu Van", "phunguyen@gmail.com", "0338630727", 20);
//        candidateDao.add(c);
        Candidate candidate= candidateDao.findById(1L);
        Assertions.assertEquals("0338630727",candidate.getPhone());

    }

}
