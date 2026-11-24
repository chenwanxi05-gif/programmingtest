package org.example;

import assessments.AssessmentFeed;
public class Departmentsystem {

    private double explained;
    private double programscore;
    private double functionality;
    private double verification;
    private double AIAssistedProgramming;
    private double designunderstanding;
    private double explanationmark;
    private double softwaredesignviva;
    private double totalUG;
    private double totalMSc;
    public Departmentsystem(){
        this.programscore=programscore;
        this.explained = explained;
        this.functionality=functionality;
        this.verification=verification;
        this.AIAssistedProgramming=AIAssistedProgramming;
        this.designunderstanding=designunderstanding;
        this.explanationmark=explanationmark;
        this.softwaredesignviva=softwaredesignviva;
        this.totalUG=totalUG;
        this.totalMSc=totalMSc;
    }
    public double getExplained(){
        double explained = assessments.AssessmentFeed.getResult(studentinformationrequest.getCID(), AssessmentFeed.PROGRAMMING_TEST,AssessmentFeed.EXPLAINED_SUCCESSFULLY);
        return explained;
    }
    public double getIndependentscore(){
        if (explained==1.0){
            double programscore = AssessmentFeed.getResult(CID, AssessmentFeed.PROGRAMMING_TEST,AssessmentFeed.PROGRAMMING_TEST);
            return programscore;
        }else{
            return programscore= programscore*0.4;
        }

    }
    public double getFunctionality(){
        double functionality = AssessmentFeed.getResult(CID, AssessmentFeed.AI_PROJECT,AssessmentFeed.FUNCTIONALITY_MARK);
        return functionality;
    }
    public double getVerification(){
        double verification = AssessmentFeed.getResult(CID, AssessmentFeed.AI_PROJECT, AssessmentFeed.VERIFICATION_MARK);
        return verification;
    }
    public double getAIAssistedProgramming(){
        double AIAssistedProgramming = 0.4*functionality+0.6*verification;
        return AIAssistedProgramming;
    }
    public double getdesignunderstanding(){
        double designunderstanding = AssessmentFeed(CID,AssessmentFeed.DESIGN_VIVA, AssessmentFeed.DESIGN_MARK);
        return designunderstanding;
    }
    public double getExplanationmark(){
        double explanationmark = AssessmentFeed(CID, AssessmentFeed.DESIGN_VIVA,AssessmentFeed.EXPLANATION_MARK);
        return explanationmark;
    }
    public double getSoftwareDesignviva(){
        double softwaredesignviva = 0.5*designunderstanding+0.5*explanationmark;
        return softwaredesignviva;
    }
    public double getTotalscoreUG(){
        totalUG=0.3*programscore+0.7*AIAssistedProgramming;
        return totalUG;
    }
    public double getTotalscoreMSc(){
        totalMSc=0.25*programscore+0.45*AIAssistedProgramming+0.3*softwaredesignviva;
        return totalMSc;
    }

}
