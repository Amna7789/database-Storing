package com.example.advanceddatabasestoringduplicate.datamodel.Repo;

import com.example.advanceddatabasestoringduplicate.datamodel.User;
import com.example.advanceddatabasestoringduplicate.domain.CommonResultDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends PagingAndSortingRepository<User, String> {
    User findByEmail(String email);
    User findByName(String name);

    /*User findByNameAndEmail(String name, String email);
    User findByName(String name);*/

    @Query(" SELECT new com.example.advanceddatabasestoringduplicate.domain.CommonResultDTO (" +
            " u.id, u.name, u.email, u.phoneNo, u.createdDate, sm.eng, sm.urdu, sm.math, " +
            " sm.arabic) FROM User u INNER join StudentMarks sm on u.id = sm.id where u.email= :email ")
    CommonResultDTO findCommonResultDTOByEmail(@Param("email") String email);
}
