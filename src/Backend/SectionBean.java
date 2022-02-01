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
public class SectionBean {
    private int SectionId;
    private String SectionName;
    private int ClassId;
    Database db = new Database();
    ArrayList<SectionBean> AllSections = new ArrayList<>();
    ResultSet rs;
    public int getSectionId() {
        return SectionId;
    }

    public void setSectionId(int SectionId) {
        this.SectionId = SectionId;
    }

    public String getSectionName() {
        return SectionName;
    }

    public void setSectionName(String SectionName) {
        this.SectionName = SectionName;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int ClassId) {
        this.ClassId = ClassId;
    }
    public String addsection(String SectionName,int ClassId2){
        String message = null;
        System.out.println(ClassId2);
        boolean result = db.addSection(SectionName, ClassId);
        if(result == true){
            message = "Section added";
        }
        else{
            message = "Section not added";
        }
        return message;
    }
    public ArrayList<SectionBean> allSectionsByClass(int Classid){
      rs = db.allSections(Classid);
        try {
            while(rs.next()){
                    int sectionId = Integer.parseInt(rs.getString("SectionId"));
                    int classId = Integer.parseInt(rs.getString("ClassId"));
                    String sectionName = rs.getString("SectionName");
                    SectionBean sectionbeans = new SectionBean();
                    sectionbeans.setSectionId(sectionId);
                    sectionbeans.setSectionName(sectionName);
                    sectionbeans.setClassId(classId);
                    AllSections.add(sectionbeans);
            } } catch (SQLException ex) {
            Logger.getLogger(SectionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
      return AllSections;
    }
}
