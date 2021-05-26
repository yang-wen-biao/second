package com.example.second.controller;

import com.example.second.entity.Teacher;
import com.example.second.service.MenuService;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin(allowCredentials = "true")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    MenuService menuService;

    private Error errors;

    /**
     * 查询所有
     */
    @GetMapping("/findAllTeachers")
    public List<Teacher> findAllTeachers() {
        return this.teacherService.findAllTeachers();
    }

    /**
     * 增加
     */
    @PostMapping("/addTeacher")
    public void addTeacher(@RequestBody Teacher teacher) throws Exception{
        this.teacherService.addTeacher(teacher);
//        errors.checkInput(teacher);
    }

    /**
     * 根据学生id删除
     */
    @PostMapping("/deleteTeacher")
    public void deleteTeacherById(@RequestParam Long uid) {
        this.teacherService.deleteTeacherById(uid);
    }

    /**
     * 编辑
     */
    @PostMapping("/updateTeacher")
    public void updateTeacher(@RequestBody Teacher teacher) {
        this.teacherService.updateTeacher(teacher);
//        errors.checkInput(teacher);
    }

    /**
     * 根据学生姓名查找
     */
    @GetMapping("/findTeacherByName")
    public List<Teacher> findTeacherByName(@RequestParam String name) {
        return this.teacherService.findTeacherByName(name);
    }

    /**
     * 批量删除
     */
    @PostMapping("/deleteTeachersByIds")
    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherService.deleteTeachersByIds(ids);
    }
}
