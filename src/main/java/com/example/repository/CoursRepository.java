package com.example.repository;

import com.example.entities.CoursMarche;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CoursRepository extends  CrudRepository<CoursMarche,Integer> {
    public List<CoursMarche> findCoursMarcheByDte(Date d);
    public CoursMarche findFirstByDte(Date d);
    public List<CoursMarche> findCoursMarcheByDev(String dev);

    public List<CoursMarche> findCoursMarcheByDteAndMrch(Date d,int m);


}
