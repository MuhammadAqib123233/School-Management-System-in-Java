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
public class ClassBean {
    private int ClassID;
    private String ClassName;
    private ArrayList<ClassBean> getClasses = new ArrayList<>();

    public int getClassID() {
        return ClassID;
    }

    public void setClassID(int ClassID) {
        this.ClassID = ClassID;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }
    public ArrayList<ClassBean> getAllClasses(){
        Database db = new Database();
        ResultSet rs = db.AllClasses();
        try {
            while(rs.next()){
                int classid = Integer.parseInt(rs.getString("ClassId"));
                String classname = rs.getString("ClassName");
                ClassBean allclasses = new ClassBean();
                allclasses.setClassID(classid);
                allclasses.setClassName(classname);
                getClasses.add(allclasses);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getClasses;
    }
}
