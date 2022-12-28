package com.example.demoRestWeb;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestTest
{
    private List<Student> list = new ArrayList<Student>();

    @GetMapping("data")
    public List<Student> getData()
    {
        return list;
    }
    @PostMapping("test")
    public String test(@RequestBody Student student)
    {
        list.add(student);
        return "Dodano studenta do listy!";
    }
    @DeleteMapping("delete")
    public String deleteData()
    {
        list.clear();

        return "Skasowano listę studentów!";
    }
}
