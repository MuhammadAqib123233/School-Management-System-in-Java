/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aqibm
 */
public class SubjectBean {
private int SubjectId;
private String SubjectName;
private String SubjectCode;
private int ClassId;
private int TeacherId;
private String ClassName;
private String TeacherName;
ArrayList<SubjectBean> getAllSubjects = new ArrayList<>();
String message;
Database db = new Database();
    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int SubjectId) {
        this.SubjectId = SubjectId;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public String getSubjectCode() {
        return SubjectCode;
    }

    public void setSubjectCode(String SubjectCode) {
        this.SubjectCode = SubjectCode;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int ClassId) {
        this.ClassId = ClassId;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int TeacherId) {
        this.TeacherId = TeacherId;
    }
    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }
   public String addSubject(String SubjectName,String SubjectCode,int ClassId,int TeacherId){
       boolean result = db.addSubject(SubjectName, SubjectCode, ClassId, TeacherId);
       if(result){
           message = "Subject Has Been Added";
       }
       else{
           message="Subject Has Not Been Added";
   }
       return message;
   }
   public ArrayList<SubjectBean> getallSubjects(){
    try {
        ResultSet rs = db.getAllSubject();
        while(rs.next()){
            SubjectBean subject = new SubjectBean();
            subject.setClassId(rs.getInt("ClassId"));
            subject.setSubjectId(rs.getInt("SubjectId"));
            subject.setTeacherId(rs.getInt("TeacherId"));
            subject.setSubjectName(rs.getString("SubjectName"));
            subject.setSubjectCode(rs.getString("SubjectCode"));
            subject.setClassName(rs.getString("ClassName"));
            subject.setTeacherName(rs.getString("Firstname"));
            getAllSubjects.add(subject);
        }
    } catch (SQLException ex) {
        Logger.getLogger(SubjectBean.class.getName()).log(Level.SEVERE, null, ex);
    }
    return getAllSubjects;
   }
   public ArrayList<SubjectBean> getallSubjectsByClass(int classid){
    try {
        ResultSet rs = db.findSubjectByClass(classid);
        while(rs.next()){
            SubjectBean subject = new SubjectBean();
            subject.setClassId(rs.getInt("SubjectId"));
            subject.setSubjectCode(rs.getString("SubjectCode"));
            subject.setSubjectName(rs.getString("SubjectName"));
            getAllSubjects.add(subject);
        }
    } catch (SQLException ex) {
        Logger.getLogger(SubjectBean.class.getName()).log(Level.SEVERE, null, ex);
    }
    return getAllSubjects;
   }
   
}
