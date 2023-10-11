package com.example.controllers;


import com.example.entities.CoursMarche;
import com.example.repository.CoursRepository;
import com.example.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Cours")

public class CoursController {
    @Autowired
    CoursService coursMarcheService;
    @Autowired
    CoursRepository coursRepository;

    public CoursController(CoursService coursMarcheService) {
        this.coursMarcheService = coursMarcheService;
    }

    // Annotation

    // Save operation

    @PostMapping("/add")
    public CoursMarche saveCoursMarche(@RequestBody CoursMarche c) {
return coursMarcheService.addCoursMarche(c);

    }

    // Read operation
    @GetMapping("/CoursMarches")
    public List<CoursMarche> retrieveAllCoursMarches()
    {

        return coursMarcheService.retrieveAllCoursMarches();
    }
    @GetMapping("/retrieve/{id}")
    public CoursMarche getCoursMarche(@PathVariable("id") Integer CoursMarcheId)
    {

        return coursMarcheService.retrieveCoursMarche(CoursMarcheId);
    }
    @GetMapping("/retrieveByDate/{d}")
    public List<CoursMarche> getCoursMarcheByDate(@PathVariable("d") @DateTimeFormat(pattern = "dd-MM-yyyy") Date d)
    {

        return coursRepository.findCoursMarcheByDte(d);
    }
    @GetMapping("/firstDate/{d}")
    public CoursMarche getFirstByDate(@PathVariable("d") @DateTimeFormat(pattern = "dd-MM-yyyy") Date d)
    {

        return coursRepository.findFirstByDte(d);
    }
    // Update operation
    @PutMapping("/update")
    public CoursMarche
    updateCoursMarche(@RequestBody CoursMarche CoursMarche)
    {

        return coursMarcheService.updateCoursMarche(CoursMarche);
    }

    // Delete operation
    @DeleteMapping("/delete/{id}")
    public String deleteCoursMarcheById(@PathVariable("id") Integer CoursMarcheId)
    {

        coursMarcheService.removeCoursMarcheById(CoursMarcheId);
        return "Deleted Successfully";
    }
    @GetMapping("/getDev/{dev}")
    public List<CoursMarche> getCoursMarcheByDev(@PathVariable("dev") String dev)
    {

        return coursRepository.findCoursMarcheByDev(dev);
    }
    @GetMapping("/getCours/{date}/{mrch}")

    public List<CoursMarche> getCoursMarcheByMrchAndDate
            (@PathVariable("date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date d,@PathVariable("mrch")int m)
    {

        return coursRepository.findCoursMarcheByDteAndMrch(d,m);
    }

}
