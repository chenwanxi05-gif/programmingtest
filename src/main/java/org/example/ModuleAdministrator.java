package org.example;

public class ModuleAdministrator {
    public ModuleAdministrator(){

    }
    public void printresultUG(){
        System.out.println("students'name"+studentinformationrequest.getStudentname()+"CID"+studentinformationrequest.getCID()+"Independent Programming Test"+Departmentsystem.getIndependentscore()+"AI project"+getAIAssistedProgramming()+"Total score"+getTotalscoreUG());
    }
    public void printresultMSc(){
        System.out.println("students'name"+studentinformationrequest.getStudentname()+"CID"+studentinformationrequest.getCID()+"Independent Programming Test"+Departmentsystem.getIndependentscore()+"AI project"+getAIAssistedProgramming()+"software viva"+getSoftwareDesignviva()+"Total score"+getTotalscoreMSc());
    }



}
