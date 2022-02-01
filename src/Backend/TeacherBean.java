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
public class TeacherBean {
    private int TeacherId;
    private String Firstname;
    private String Lastname;
    private String Qualification;
    private String ContactNo;
    private String CNIC;
    ArrayList<TeacherBean> allTeachers = new ArrayList<>();
    String message;
    Database db = new Database();
    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int TeacherId) {
        this.TeacherId = TeacherId;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
    public String addTeacher(String Firstname, String Lastname, String Qualification, String Contactno,String CNIC){
        boolean result = db.addTeacher(Firstname, Lastname, Qualification, Contactno, CNIC);
        if(result){
            message = "Teacher Has Beean Added";
        }
        else{
            message="Teacher Has not been added";
        }
        return message;
    }
    public ArrayList<TeacherBean> getAllTeachers(){
        ResultSet rs = db.getAllTeachers();
        try {
            while(rs.next()){
                TeacherBean teacher = new TeacherBean();
                int teacherId = rs.getInt("TeacherId");
                String firstname = rs.getString("Firstname");
                String lastname = rs.getString("Lastname");
                String qualification = rs.getString("Qualification");
                String contactNo = rs.getString("ContactNo");
                String cnic = rs.getString("CNIC");
                teacher.setTeacherId(teacherId);
                teacher.setFirstname(firstname);
                teacher.setLastname(lastname);
                teacher.setQualification(qualification);
                teacher.setContactNo(contactNo);
                teacher.setCNIC(cnic);
                allTeachers.add(teacher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allTeachers;
    }
    public String updateTeacher(int TeacherId,String Firstname, String Lastname, String Qualification, String Contactno,String CNIC)
    {
        boolean result = db.updateTeacher(TeacherId, Firstname, Lastname, Qualification, Contactno, CNIC);
        if(result){
            message = "Student Has been Updated";
        }
        else{
            message="Student not Updated";
        }
        return message;
    }
    public String deleteTeacher(int id){
        boolean result = db.deleteTeacher(id);
        if(result){
            message = "Teacher has been deleted";
        }
        else{
            message = "Teacher has not been deleted";
        }
            return message;
    }
}
