package com.example.second.service.impl;

//import com.example.second.dao.TeacherCopyDao;
//import com.example.second.dao.TeacherCountDao;
import com.example.second.dao.TeacherDao;
import com.example.second.entity.Teacher;
//import com.example.second.exception.ValidateException;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class TeacherServiceBean implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

//    @Autowired
//    private TeacherCountDao teacherCountDao;
//
//    @Autowired
//    TeacherCopyDao teacherCopyDao;

    public List<Teacher> findAllTeachers() {
        return this.teacherDao.findAllTeachers();
    }


    @Transactional
    public void addTeacher(Teacher teacher) {
        if (errors(teacher).size()>0){
//            throw new ValidateException("-1",errors(teacher).toString());
        }else{
            this.teacherDao.addTeacher(teacher);
        }
//        this.teacherDao.addTeacher(teacher);
//        this.teacherCopyDao.addTeacher(teacher);
        Integer count = this.teacherDao.getCountTeachers();
        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
//        this.teacherCountDao.addCount(count);
    }

    public void deleteTeacherById(Long uid) {
        this.teacherDao.deleteTeacherById(uid);
        Integer count = this.teacherDao.getCountTeachers();
        //this.teacherCountDao.addCount(count);
    }

    public void updateTeacher(Teacher teacher) {
        this.teacherDao.updateTeacher(teacher);
    }

    public List<Teacher> findTeacherByName(String name) {
        return this.teacherDao.findTeacherByName(name);
    }

    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherDao.deleteTeachersByIds(ids);
    }

    public List<String> errors(Teacher teaher){
        List<String> errors = new ArrayList<>();
        if (teaher.getUid()==null||teaher.getUid()>1000000||teaher.getUid()<0){
            errors.add("Id错误");
        }
        if (teaher.getName()==null||teaher.getName().equals("")||teaher.getName().length()<2||teaher.getName().length()>19){
            errors.add("姓名输入有误");
        }
        if (teaher.getAge()==null||teaher.getAge()<24||teaher.getAge()>65){
            errors.add("年龄输入不规范，应该在24~65之间");
        }
        if (teaher.getPhone()==null||!(teaher.getPhone().matches("^1(3[0-9]|5[0-3,5-9]|7[1-3,5-8]|8[0-9])\\d{8}$"))){
            errors.add("11位数的电话号码格式不规范");
        }
        if (teaher.getMail()==null||!(teaher.getMail().matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$"))){
            errors.add("邮箱格式错误");
        }
        return errors;
    }
}
