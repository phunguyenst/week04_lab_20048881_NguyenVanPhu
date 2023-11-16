package com.iuh.phu.se.nguyenvanphu_20048881_week4;

import com.iuh.phu.se.dao.CandidateDao;

import com.iuh.phu.se.dao.JobDao;
import com.iuh.phu.se.models.Candidate;
import com.iuh.phu.se.models.Job;
import com.iuh.phu.se.services.CandidateServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.util.List;


@SpringBootTest
class NguyenVanPhu20048881Week4ApplicationTests {

    @Autowired
    private CandidateServices candidateServices;


//    @Test
//    void text_insert() {
//
//        Candidate c = new Candidate(4, "Phu Van", "phunguyen@gmail.com", "0338630727", 20);
//        candidateServices.add(c);
//
//
//
//    }
//
//    @Test
//    void text_update(){
//        Candidate c = new Candidate(3, "Nguyen Van Phu", "phunguyen@gmail.com", "0338630727", 20);
//        c.setCant_id(3);
//         candidateServices.update(c);
//
//    }
//    @Test
//    void text_delete(){
//        Candidate c = new Candidate();
//        candidateServices.delete(3L);
//
//
//    }
    @Test
    void findById(){
       Candidate c =  candidateServices.findById(1L);
       Assertions.assertNotNull(c);

    }

    @Test
    void getAll(){
       List<Candidate> list = candidateServices.getAll();
        System.out.println("---------------danh sách ứng viên ------------------");
        for (Candidate lstCan: list
             ) {
            System.out.println(lstCan);
        }

    }


}
