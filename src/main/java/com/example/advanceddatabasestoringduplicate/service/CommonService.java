package com.example.advanceddatabasestoringduplicate.service;

import com.example.advanceddatabasestoringduplicate.datamodel.Repo.UserRepo;
import com.example.advanceddatabasestoringduplicate.datamodel.Repo.studentMarksRepo;
import com.example.advanceddatabasestoringduplicate.datamodel.StudentMarks;
import com.example.advanceddatabasestoringduplicate.datamodel.User;
import com.example.advanceddatabasestoringduplicate.domain.CommonDTOIn;
import com.example.advanceddatabasestoringduplicate.domain.CommonResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CommonService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    com.example.advanceddatabasestoringduplicate.datamodel.Repo.studentMarksRepo studentMarksRepo;

    public void createStudent(CommonDTOIn commonDTOIn){
        User u = new User();

        u.setId(UUID.randomUUID().toString());
        u.setName(commonDTOIn.getName());
        u.setEmail(commonDTOIn.getEmail());
        u.setPhoneNo(commonDTOIn.getPhoneNo());
        u.setCreatedDate(new Date(System.currentTimeMillis()));
        userRepo.save(u);
        StudentMarks sm = new StudentMarks();
        sm.setId(u.getId());
        sm.setEng(commonDTOIn.getEng());
        sm.setUrdu(commonDTOIn.getUrdu());
        sm.setMath(commonDTOIn.getMath());
        sm.setArabic(commonDTOIn.getArabic());
        commonDTOIn.setCreatedDate(u.getCreatedDate());
        studentMarksRepo.save(sm);



    }

    public CommonResultDTO getStudent(String email, String name) {
        User user = userRepo.findByEmail(email);
        StudentMarks studentMarks = studentMarksRepo.findById(user.getId());
        User user1 = userRepo.findByName(name);


        CommonResultDTO crd = new CommonResultDTO();
        crd.setId(user.getId());
        crd.setName(user.getName());
        crd.setEmail(user.getEmail());
        crd.setPhoneNo(user.getPhoneNo());
        crd.setCreatedDate(user.getCreatedDate());

        crd.setId(studentMarks.getId());
        crd.setEng(studentMarks.getEng());
        crd.setUrdu(studentMarks.getUrdu());
        crd.setMath(studentMarks.getMath());
        crd.setArabic(studentMarks.getArabic());
        return crd;

    }

    public CommonResultDTO getStudentInfo(String email) {
        return userRepo.findCommonResultDTOByEmail(email);
    }

    public CommonResultDTO getStudentByEmail(String email) {
        User user = userRepo.findByEmail(email);
        CommonResultDTO crd = new CommonResultDTO();
        crd.setId(user.getId());
        crd.setName(user.getName());
        crd.setEmail(user.getEmail());
        crd.setPhoneNo(user.getPhoneNo());
        crd.setCreatedDate(user.getCreatedDate());
        return crd;
    }
}
