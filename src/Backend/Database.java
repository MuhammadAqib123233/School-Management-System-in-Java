/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aqibm
 */
public class Database {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    public Database() {
        try{
            java.lang.Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smsdb","root","");
        } catch(ClassNotFoundException e){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,e);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean addStudent(String Firstname, String Lastname, String Fathername,String Address,String Contactno,int Classid, String Section){
        try{
            String query = "Insert Into student_tb(Firstname,Lastname,Fathername,Address,ContactNo,Class,Section)values("+"'"+Firstname+"'"+","+"'"+Lastname+"'"+","+"'"+Fathername+"'"+","+"'"+Address+"'"+","+"'"+Contactno+"'"+","+Classid+","+"'"+Section+"'"+")";
            System.out.println("Insert Into student_tb(Firstname,Lastname,Fathername,Address,ContactNo,Class,Section)values("+"'"+Firstname+"'"+","+"'"+Lastname+"'"+","+"'"+Fathername+"'"+","+"'"+Address+"'"+","+"'"+Contactno+"'"+","+Classid+","+"'"+Section+"'"+")");
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean deleteStudent(int id){
        try{
            String query = "Delete From student_tb Where StudentId="+id;
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean updateStudent(int Studentid,String Firstname, String Lastname, String Fathername, String Contactno,String Address,String Section, int Classid)
    {
        try{
            String query = "Insert Into student_tb Set Firstname="+"'"+Firstname+"'"+","+"Lastname="+"'"+Lastname+"'"+","+"Fathername="+"'"+Fathername+"'"+","+"Address="+"'"+Address+"'"+","+"ContactNo="+"'"+Contactno+"'"+","+"Class="+Classid+","+"Section="+"'"+Section+"'";
            System.out.println("Insert Into student_tb Set Firstname="+Firstname+"'"+","+"Lastname="+"'"+Lastname+"'"+","+"Fathername="+"'"+Fathername+"'"+","+"Address="+"'"+Address+"'"+","+"ContactNo="+"'"+Contactno+"'"+","+"ClassId="+"'"+Classid+"'"+","+"Section="+"'"+Section+"'"+")");
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean addClass(String Classname){
        try{
            String query = "Insert Into class_tb(ClassName)Values("+"'"+Classname+"'"+")";
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet AllClasses(){
        try {
            String query ="Select * from class_tb";
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public boolean addSection(String SectionName, int ClassId){
        try {
            String query = "Insert Into section_tb(SectionName,ClassId)Values("+"'"+SectionName+"'"+","+ClassId+")";
//            System.out.println("Insert Into section_tb(SectionName,ClassId)Values("+"'"+SectionName+"'"+","+ClassId+")");
            pst = con.prepareStatement(query);
//            pst.setString(1,SectionName);
//            pst.setInt(2,ClassId);
            int k = pst.executeUpdate(query);
            if(k==1)
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    public ResultSet allSections(int Classid){
        try {
            String query = "SELECT * FROM section_tb Where CLassId="+Classid;
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public ResultSet getAllStudents(){
        try {
             String query = "Select * from student_tb Inner Join class_tb on class_tb.ClassId = student_tb.Class";
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     public boolean addTeacher(String Firstname, String Lastname, String Qualification,String Contactno,String CNIC){
        try{
            String query = "Insert Into teacher_tb(Firstname,Lastname,Qualification,ContactNo,CNIC)values("+"'"+Firstname+"'"+","+"'"+Lastname+"'"+","+"'"+Qualification+"'"+","+"'"+Contactno+"'"+","+"'"+CNIC+"'"+")";
//            System.out.println("Insert Into student_tb(Firstname,Lastname,Fathername,Address,ContactNo,Class,Section)values("+"'"+Firstname+"'"+","+"'"+Lastname+"'"+","+"'"+Fathername+"'"+","+"'"+Address+"'"+","+"'"+Contactno+"'"+","+Classid+","+"'"+Section+"'"+")");
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean updateTeacher(int TeacherId,String Firstname, String Lastname, String Qualification, String Contactno,String CNIC)
    {
        try{
            String query = "Update teacher_tb Set Firstname="+"'"+Firstname+"'"+","+"Lastname="+"'"+Lastname+"'"+","+"Qualification="+"'"+Qualification+"'"+","+"ContactNo="+"'"+Contactno+"'"+","+"ContactNo="+"'"+Contactno+"'"+","+"CNIC="+"'"+CNIC+"'"+"Where TeacherId="+TeacherId;
//            System.out.println("Insert Into student_tb Set Firstname="+Firstname+"'"+","+"Lastname="+"'"+Lastname+"'"+","+"Fathername="+"'"+Fathername+"'"+","+"Address="+"'"+Address+"'"+","+"ContactNo="+"'"+Contactno+"'"+","+"ClassId="+"'"+Classid+"'"+","+"Section="+"'"+Section+"'"+")");
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean deleteTeacher(int id){
        try{
            String query = "Delete From teacher_tb Where TeacherId="+id;
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet getAllTeachers(){
        try {
             String query = "Select * from teacher_tb";
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public boolean addSubject(String Subjectname, String SubjectCode, int ClassId, int TeacherId){
        try {
            String query = "Insert Into subject_tb(SubjectName,SubjectCode,ClassId,TeacherId)Values("+"'"+Subjectname+"'"+","+"'"+SubjectCode+"'"+","+ClassId+","+TeacherId+")";
            pst = con.prepareStatement(query);
//            pst.setString(1,SectionName);
//            pst.setInt(2,ClassId);
            int k = pst.executeUpdate(query);
            if(k==1)
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    public ResultSet getAllSubject(){
        try {
             String query = "Select * from subject_tb inner join class_tb on class_tb.ClassId=subject_tb.ClassId Inner Join teacher_tb on teacher_tb.TeacherId = subject_tb.TeacherId;";
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet findStudentByClass(int classid){
        try {
             String query = "Select * from student_tb where Class="+classid;
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet findStudentBySection(String Section){
        try {
             String query = "Select * from student_tb where Section="+"'"+Section+"'";
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet findSectionByClass(int classid){
        try {
             String query = "Select * from section_tb where ClassId="+classid;
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet findSubjectByClass(int classid){
        try {
             String query = "Select * from subject_tb where ClassId="+classid;
             st = con.createStatement();
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public boolean addResult(String obmarks, Double tomarks, Double totalmarks,Double Percentage,String Grade,String Status, int stid){
        try{
            String query = "Insert Into result_tb(Obtained_Marks,Total_Obtained_Marks,Total_Marks,Percentage,Grade,Status,StudentId)values('"+obmarks+"'"+","+"'"+tomarks+"'"+","+totalmarks+","+Percentage+","+"'"+Grade+"'"+","+"'"+Status+"'"+","+stid+")";
            System.out.println("Insert Into result_tb(Obtained Marks,Total Obtained Marks,Total Marks,Percentage,Grade,Status,StudentId)values('"+obmarks+"'"+","+"'"+tomarks+"'"+","+totalmarks+","+Percentage+","+"'"+Grade+"'"+","+"'"+Status+"'"+","+stid+")");
            pst = con.prepareStatement(query);
            int k = pst.executeUpdate();
            if(k==1)
            {
                return true;
            }
        }catch(SQLException ex){ 
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ResultSet AllSections(){
        try {
            String query ="SELECT *, COUNT(ClassId) AS Number_Of_Students FROM student_tb st LEFT JOIN class_tb cl ON (cl.ClassId = st.Class) GROUP BY st.Section";
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet AllStudentsResult(){
        try {
            String query ="Select * from result_tb Inner Join student_tb on student_tb.StudentId = result_tb.StudentId";
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
