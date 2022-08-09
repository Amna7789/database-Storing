package com.example.advanceddatabasestoringduplicate.datamodel.Repo;

import com.example.advanceddatabasestoringduplicate.datamodel.StudentMarks;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface studentMarksRepo extends PagingAndSortingRepository<StudentMarks, Long> {
     StudentMarks findById(String id);
}
