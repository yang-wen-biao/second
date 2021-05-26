package com.example.second.entity;


//import org.hibernate.validator.constraints.Length;
//
//import javax.validation.constraints.*;

public class Teacher {

    private Long uid;

//    @NotNull(message = "姓名不能为空")
//    @Length(min = 2, max = 19, message = "长度要在2到19之间")
    private String name;

//    @Min(value = 24, message = "最小值为24")
//    @Max(value = 65,message = "最大值为65")
    private Integer age;

    private String sex;

    private String homeland;

    private String nation;

    private String grade;

    private String subject;

    private String exp;

    private String address;

    private String phone;

//    @NotEmpty
//    @Email(message="邮件格式不正确")
    private String mail;

    private String qq;

    private String wechat;

    private String office;

    private String conditions;

    private String hononr;

    private String worktime;

    private String party;

    private String school;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String condition) {
        this.conditions = condition;
    }

    public String getHononr() {
        return hononr;
    }

    public void setHononr(String hononr) {
        this.hononr = hononr;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
