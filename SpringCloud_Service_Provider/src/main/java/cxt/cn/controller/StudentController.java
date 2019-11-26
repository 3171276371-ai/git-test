package cxt.cn.controller;

import cxt.cn.pojo.Student;
import cxt.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/24 21:17
 */
@RequestMapping("student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("{id}")
    public Student findById(@PathVariable("id")String id){
        return studentService.findById(id);
    }
}
