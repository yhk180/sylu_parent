package com.example.service_edu.edu.controller;


import com.example.service_edu.edu.entity.EduTeacher;
import com.example.service_edu.edu.service.IEduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author gouge
 * @since 2021-12-25
 */
@RestController
@RequestMapping("/edu/eduTeacher")
public class EduTeacherController {
    @Autowired
    private IEduTeacherService iEduTeacherService;

    @GetMapping("findAll")
    public List<EduTeacher> FindAllTeacher(){
        List<EduTeacher> list = iEduTeacherService.list();
        return list;
    }
}

