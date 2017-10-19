package com.wisely;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/")
    public String usetIndex(Model model){
        Person single = new Person("aa",11);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx",111);
        Person p2 = new Person("yy",222);
        Person p3 = new Person("zz",333);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);

        return "index";
    }
    @RequestMapping("/xx")
    public String xx(){


        return "testXX";
    }
}
