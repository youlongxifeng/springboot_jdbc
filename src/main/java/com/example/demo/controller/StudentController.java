package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    private static int cnt = 0;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Student> queryAll() {
        List<Student> list = new ArrayList<Student>();
        list = studentRepository.findAll();
        return list;
    }

    @RequestMapping("add")
    @ResponseBody
    public void add() {
        Student user = new Student();
        user.setName("junjun" + (cnt++));
        user.setAge(6);
        studentRepository.save(user);
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    @ResponseBody
    public void add2(@RequestParam(name = "name",defaultValue = "alipay",required=false) String name,@RequestParam(name = "age",required=false) int age) {
        Student user = new Student();
        user.setName(name);
        user.setAge(age);
        studentRepository.save(user);
    }

    @RequestMapping("update")
    @ResponseBody
    public void update() {
        Student user = studentRepository.findById(1).get();
        user.setName("duoduo");
        studentRepository.save(user);
    }

    // 系统首页
    @GetMapping("/show")
    public String show(ModelMap mmap) {

        // 数据统计
        int userCount =23;// userService.selectUserStatistics();
        int companyCount = 50;//companyService.selectCompanyStatistics();
        int recyclerCount =100;// recyclerService.selectRecyclerStat(new Recycler());
        BigDecimal totalWeigth =new BigDecimal(32); //dustbinStatService.selectDustbinStatTotalWeigth();
        mmap.put("userCount", userCount);
        mmap.put("companyCount", companyCount);
        mmap.put("recyclerCount", recyclerCount);
        mmap.put("totalWeigth", totalWeigth);


        return "show";
    }
}
