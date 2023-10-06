package com.iuh.phu.se.nguyenvanphu_20048881_week4;

import com.iuh.phu.se.dao.CandidateDao;
import com.iuh.phu.se.models.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class NguyenVanPhu20048881Week4Application {
//    @Autowired
//    private Candidate candidate;
@Bean
public CandidateDao candidateDao(DataSource dataSource){
    return new CandidateDao(dataSource);
}
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(NguyenVanPhu20048881Week4Application.class, args);
//
//        Candidate id = candidate.findById(1L);
//        System.out.println(id.getPhone());


    }

}
