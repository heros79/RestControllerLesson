package am.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by David on 5/25/2018.
 */

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private Student student;

    @CrossOrigin
    @RequestMapping(value = "/student", method = RequestMethod.GET, produces = "application/json")
    public Student getStudentData() {
        student.setName("David");
        student.setName("40");
        student.getName();
        student.getAge();

        return student;
    }
}
