package com.example.myprojectapplicationf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//
//@Autowired
//UserdetailRepository userdetailRepository;

public interface UserdetailRepository extends JpaRepository<Userdetail, String> {
//    @Query(value = "SELECT * from userdetails u where u.email?1", nativeQuery = true);
//    public optional< Userdetail> findByEmail(String email);
}