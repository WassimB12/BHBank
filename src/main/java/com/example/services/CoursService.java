package com.example.services;


import com.example.entities.CoursMarche;

import java.util.List;

public interface CoursService {
    CoursMarche addCoursMarche(CoursMarche p);

    // read operation
    List<CoursMarche> retrieveAllCoursMarches();

    CoursMarche retrieveCoursMarche(Integer idCoursMarche);

    CoursMarche updateCoursMarche(CoursMarche p);


    // delete operation
    void removeCoursMarcheById(Integer idCoursMarche);

}
