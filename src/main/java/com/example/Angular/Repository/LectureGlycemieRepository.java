package com.example.Angular.Repository;

import com.example.Angular.Model.LectureGlycemie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface LectureGlycemieRepository extends JpaRepository<LectureGlycemie, Integer> {


}
