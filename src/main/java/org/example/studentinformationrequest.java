package org.example;

import java.util.List;

public class studentinformationrequest {

    private List<String> CIDs;
    private String Studentname;
    private String Studenttype;
    private String CID;
    public studentinformationrequest(){
        this.CIDs=CIDs;
        this.Studentname=Studentname;
        this.Studenttype=Studenttype;
    }
    public List<String> getCIDs(){
        for (String CID: assessments.AssessmentFeed.getCIDs()){
            CIDs.add(CID);
        }
        return CIDs;
    }
    public String getCID(String targetCID){
        for(String CID :CIDs){
            if (CID.equals(targetCID)){
                return CID;
            }
        }
        return null;
    }
    public String getStudentname(String targetCID){
        getCID(targetCID);
        Studentname= assessments.AssessmentFeed.getStudentName(CID);
        return Studentname;
    }


    public String getStudenttype(String targetCID){
        for(String CID :CIDs){
            if (CID.equals(targetCID)){
                return CID;
            }
        }
        Studenttype= assessments.AssessmentFeed.getStudentType(CID);
        return Studenttype;
    }
}

