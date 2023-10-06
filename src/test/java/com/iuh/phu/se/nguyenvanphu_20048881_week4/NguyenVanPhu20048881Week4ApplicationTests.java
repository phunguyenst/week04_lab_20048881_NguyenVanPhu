package com.iuh.phu.se.nguyenvanphu_20048881_week4;

import com.iuh.phu.se.dao.CandidateDao;

import com.iuh.phu.se.dao.JobDao;
import com.iuh.phu.se.models.Candidate;
import com.iuh.phu.se.models.Job;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.util.List;


@SpringBootTest
class NguyenVanPhu20048881Week4ApplicationTests {

    @Autowired
    private CandidateDao candidateDao;

    @Autowired
    private JobDao jobDao;

    @Test
    void text_insert() {

        Candidate c = new Candidate(3, "Phu Van", "phunguyen@gmail.com", "0338630727", 20);
        candidateDao.add(c);



    }
//
//    @Test
//    void text_update(){
//        Candidate c = new Candidate(3, "Nguyen Van Phu", "phunguyen@gmail.com", "0338630727", 20);
//        c.setCant_id(3);
//         candidateDao.update(c);
//
//    }
//    @Test
//    void text_delete(){
//        Candidate c = new Candidate();
//        candidateDao.delete(3L);
//
//
//    }
//    @Test
//    void findById(){
//       Candidate c =  candidateDao.findById(1L);
//       Assertions.assertNotNull(c);
//
//    }
//
//    @Test
//    void getAll(){
//       List<Candidate> list = candidateDao.getAll();
//        System.out.println("---------------danh sách ứng viên ------------------");
//        for (Candidate lstCan: list
//             ) {
//            System.out.println(lstCan);
//        }
//
//    }
@Test
void test_jogInsert() {
    Candidate c = new Candidate(3, "Phu Van", "phunguyen@gmail.com", "0338630727", 20);
    Job job = new Job(3, "computer sience", "develop AI", "Ba ria Vung Tau", 1000.3, c);
    jobDao.add(job);

}


}
