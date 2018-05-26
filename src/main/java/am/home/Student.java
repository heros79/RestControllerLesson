package am.home;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by David on 5/25/2018.
 */

@Getter
@Setter
@Component
public class Student {

    private String name;

    private String age;

    public Student() {
    }

}
