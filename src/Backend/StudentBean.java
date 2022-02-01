/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aqibm
 */
public class StudentBean {
    private int StudentId;
    private String Firstname;
    private String Lastname;
    private String Fathername;
    private String ContactNo;
    private String Address;
    private int CLassId;
    private String ClassName;
    private String Section;

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }
    String message;
    ArrayList<StudentBean> studentdetails = new ArrayList<>();
    Database db = new Database();
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
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

    public String getFathername() {
        return Fathername;
    }

    public void setFathername(String Fathername) {
        this.Fathername = Fathername;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public int getCLassId() {
        return CLassId;
    }

    public void setCLassId(int CLassId) {
        this.CLassId = CLassId;
    }
    public String addStudent(String Firstname, String Lastname, String Fathername, String Address,String ContactNo,int Classid, String Section){
        boolean result = db.addStudent(Firstname, Lastname, Fathername, Address, ContactNo,Classid,Section);
        if(result){
            message = "Student Added Successfully";
        }else{
            message = "Student not Added Successfully";
        }
        return message;
    }
    public ArrayList<StudentBean> getAllStudents(){
        ResultSet rs = db.getAllStudents();
        try {
            while(rs.next()){
                StudentBean std = new StudentBean();
                int Stdid = rs.getInt("StudentId");
                String firstname = rs.getString("Firstname");
                String lastname = rs.getString("Lastname");
                String fathername = rs.getString("Fathername");
                String address = rs.getString("Address");
                String contactNo = rs.getString("ContactNo");
                String classname = rs.getString("Classname");
                String section = rs.getString("Section");
                std.setStudentId(Stdid);
                std.setFirstname(firstname);
                std.setLastname(lastname);
                std.setFathername(fathername);
                std.setAddress(address);
                std.setContactNo(contactNo);
                std.setClassName(classname);
                std.setSection(section);
                studentdetails.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentdetails;
    }
    public ArrayList<StudentBean> getAllStudentsBySection(String section){
        ResultSet rs = db.findStudentBySection(section);
        try {
            while(rs.next()){
                StudentBean std = new StudentBean();
                int Stdid = rs.getInt("StudentId");
                String firstname = rs.getString("Firstname");
                String lastname = rs.getString("Lastname");
                String fathername = rs.getString("Fathername");
                String address = rs.getString("Address");
                String contactNo = rs.getString("ContactNo");
                String classname = rs.getString("Class");
                String section2 = rs.getString("Section");
                std.setStudentId(Stdid);
                std.setFirstname(firstname);
                std.setLastname(lastname);
                std.setFathername(fathername);
                std.setAddress(address);
                std.setContactNo(contactNo);
                std.setClassName(classname);
                std.setSection(section2);
                studentdetails.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentdetails;
    }
    public String updateStudent(int Studentid,String Firstname, String Lastname, String Fathername, String Contactno,String Address,String Section, int Classid)
    {
        boolean result = db.updateStudent(Studentid, Firstname, Lastname, Fathername, Contactno, Address, Section, Classid);
        if(result){
            message = "Student Has been Updated";
        }
        else{
            message="Student not Updated";
        }
        return message;
    }
    public String deleteStudent(int id){
        boolean result = db.deleteStudent(id);
        if(result){
            message = "student has been deleted";
        }
        else{
            message = "student has not been deleted";
        }
            return message;
    }
}
