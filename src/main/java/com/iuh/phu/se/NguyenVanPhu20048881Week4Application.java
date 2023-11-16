package com.iuh.phu.se;

import com.iuh.phu.se.dao.CandidateDao;
import com.iuh.phu.se.dao.JobDao;
import com.iuh.phu.se.models.Candidate;

import com.iuh.phu.se.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
@SpringBootApplication
public class NguyenVanPhu20048881Week4Application {
    public static void main(String[] args) {
        SpringApplication.run(NguyenVanPhu20048881Week4Application.class,args);

    }
    @Autowired
    private CandidateServices candidateServices;


    @Bean
    public CommandLineRunner lineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                List<Candidate> list = candidateServices.getAll();
//                System.out.println("---------------danh sách ứng viên ------------------");
//                for (Candidate lstCan: list
//                ) {
//                    System.out.println(lstCan);
//                }
            }
        };
    }
}
