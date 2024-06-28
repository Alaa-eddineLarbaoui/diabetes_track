
package com.example.Angular.Service;


import com.example.Angular.Model.LectureGlycemie;
import com.example.Angular.Repository.LectureGlycemieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;


@Service
public class LectureService {

    @Autowired
    private LectureGlycemieRepository lectureRepository;

    @Transactional
    public void addLecture(LectureGlycemie gr) {
        lectureRepository.save(gr);
    }

    @Transactional
    public ArrayList<LectureGlycemie> ShowLectures() {
        return (ArrayList<LectureGlycemie>) lectureRepository.findAll();

    }
    @Transactional
    public void delete(Integer id) {
        lectureRepository.deleteById(id);
    }



    }