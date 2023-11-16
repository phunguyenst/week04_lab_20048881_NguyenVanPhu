package com.iuh.phu.se.services;

import com.iuh.phu.se.dao.CandidateDao;
import com.iuh.phu.se.models.Candidate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CandidateServices {
    private CandidateDao candidateDao;

    public CandidateServices(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    public List<Candidate> getAll(){
        return candidateDao.getAll();
    }


    public void delete(Long id){
         candidateDao.delete(id);
    }

    public void add(Candidate candidate){
        candidateDao.add(candidate);
    }

    public void update(Candidate candidate){
        candidateDao.update(candidate);
    }

    public Candidate findById(Long id){
        return candidateDao.findById(id);
    }
}
