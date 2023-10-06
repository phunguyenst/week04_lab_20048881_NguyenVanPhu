package com.iuh.phu.se.nguyenvanphu_20048881_week4;

import com.iuh.phu.se.dao.CandidateDao;
import com.iuh.phu.se.dao.JobDao;
import com.iuh.phu.se.models.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.iuh.phu.se.dao","com.iuh.phu.se.models"})
public class NguyenVanPhu20048881Week4Application {
    public static void main(String[] args) {
        SpringApplication.run(NguyenVanPhu20048881Week4Application.class,args);

    }
    @Autowired
    private CandidateDao candidateDao;
    @Autowired
    private JobDao jobDao;

    @Bean
    public CommandLineRunner lineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                List<Candidate> list = candidateDao.getAll();
                System.out.println("---------------danh sách ứng viên ------------------");
                for (Candidate lstCan: list
                ) {
                    System.out.println(lstCan);
                }
            }
        };
    }
}
