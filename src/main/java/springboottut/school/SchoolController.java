package springboottut.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @RequestMapping("/schools")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/school")
    public void addSchool(@RequestBody School school) {
        schoolService.addSchool(school);
    }
}
