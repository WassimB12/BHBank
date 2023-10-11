package com.example.services;


import com.example.entities.CoursMarche;
import com.example.repository.CoursRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class CoursServiceImpl implements CoursService{
    @Autowired
    CoursRepository coursRepository;

    @Override
    public CoursMarche addCoursMarche(CoursMarche p) {
        return coursRepository.save(p);

    }
    @Override
    public CoursMarche updateCoursMarche(CoursMarche p) {
        return coursRepository.save(p);


    }

    @Override
    public void removeCoursMarcheById(Integer idCoursMarche) {
        coursRepository.deleteById(idCoursMarche);
    }



    @Override
    public CoursMarche retrieveCoursMarche(Integer idCoursMarche) {
        return coursRepository.findById(idCoursMarche).orElse(null);
    }



    @Override
    public List<CoursMarche> retrieveAllCoursMarches() {
        List<CoursMarche> CoursMarches =new ArrayList<>();
        coursRepository.findAll().forEach(CoursMarches::add);

        return CoursMarches;
    }
}
