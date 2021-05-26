package com.example.second.service.impl;

//import com.example.second.dao.CourseCopyDao;
//import com.example.second.dao.CourseCountDao;

import com.example.second.dao.CourseDao;
import com.example.second.entity.Course;
import com.example.second.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CourseServiceBean implements CourseService {

    @Autowired
    private CourseDao courseDao;

//    @Autowired
//    private CourseCountDao courseCountDao;
//
//    @Autowired
//    CourseCopyDao courseCopyDao;

    public List<Course> findAllCourses() {
        return this.courseDao.findAllCourses();
    }


    @Transactional
    public void addCourse(Course course) {
//        if (errors(course).size()>0){
////            throw new ValidateException("-1",errors(course).toString());
//        }else{
            this.courseDao.addCourse(course);
//        }
//        this.courseDao.addCourse(course);
//        this.courseCopyDao.addCourse(course);
        Integer count = this.courseDao.getCountCourses();
        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
//        this.courseCountDao.addCount(count);
    }

    public void deleteCourseById(Long uid) {
        this.courseDao.deleteCourseById(uid);
        Integer count = this.courseDao.getCountCourses();
        //this.courseCountDao.addCount(count);
    }

    public void updateCourse(Course course) {
        this.courseDao.updateCourse(course);
    }

    public List<Course> findCourseByName(String name) {
        return this.courseDao.findCourseByName(name);
    }

    public Integer deleteCoursesByIds(Integer[] ids) {
        return this.courseDao.deleteCoursesByIds(ids);
    }

//    public List<String> errors(Course teaher){
//        List<String> errors = new ArrayList<>();
//        if (teaher.getUid()==null||teaher.getUid()>1000000||teaher.getUid()<0){
//            errors.add("Id错误");
//        }
//        if (teaher.getName()==null||teaher.getName().equals("")||teaher.getName().length()<2||teaher.getName().length()>19){
//            errors.add("姓名输入有误");
//        }
//        if (teaher.getAge()==null||teaher.getAge()<24||teaher.getAge()>65){
//            errors.add("年龄输入不规范，应该在24~65之间");
//        }
//        if (teaher.getPhone()==null||!(teaher.getPhone().matches("^1(3[0-9]|5[0-3,5-9]|7[1-3,5-8]|8[0-9])\\d{8}$"))){
//            errors.add("11位数的电话号码格式不规范");
//        }
//        if (teaher.getMail()==null||!(teaher.getMail().matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$"))){
//            errors.add("邮箱格式错误");
//        }
//        return errors;
//    }
}
