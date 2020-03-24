/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbdulMoez
   Reg# CS120192078 ( Section "B")
 */
 
public class Paper 
{
    private String PaperTitle;
    private int PaperIdNumber;
    private String CourseCode;
    private String CourseIncharge;
    private String Smester;
    private String ProgramName;
    private String TypeOfExam;
    private String invigilator;
    private String loaction;
    private  int   date , time ;
    private int NumberOfStudent;
    private boolean collected  = false;

    public Paper(String PaperTitle, int PaperIdNumber, String CourseCode, String CourseIncharge, String Smester, String ProgramName, String TypeOfExam, String invigilator, String loaction, int date, int time, int NumberOfStudent) {
        this.PaperTitle = PaperTitle;
        this.PaperIdNumber = PaperIdNumber;
        this.CourseCode = CourseCode;
        this.CourseIncharge = CourseIncharge;
        this.Smester = Smester;
        this.ProgramName = ProgramName;
        this.TypeOfExam = TypeOfExam;
        this.invigilator = invigilator;
        this.loaction = loaction;
        this.date = date;
        this.time = time;
        this.NumberOfStudent = NumberOfStudent;
    }

    public String getPaperTitle() {
        return PaperTitle;
    }

    public void setPaperTitle(String PaperTitle) {
        this.PaperTitle = PaperTitle;
    }

    public int getPaperIdNumber() {
        return PaperIdNumber;
    }

    public void setPaperIdNumber(int PaperIdNumber) {
        this.PaperIdNumber = PaperIdNumber;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseIncharge() {
        return CourseIncharge;
    }

    public void setCourseIncharge(String CourseIncharge) {
        this.CourseIncharge = CourseIncharge;
    }

    public String getSmester() {
        return Smester;
    }

    public void setSmester(String Smester) {
        this.Smester = Smester;
    }

    public String getProgramName() {
        return ProgramName;
    }

    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    public String getTypeOfExam() {
        return TypeOfExam;
    }

    public void setTypeOfExam(String TypeOfExam) {
        this.TypeOfExam = TypeOfExam;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(String invigilator) {
        this.invigilator = invigilator;
    }

    public String getLoaction() {
        return loaction;
    }

    public void setLoaction(String loaction) {
        this.loaction = loaction;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(int NumberOfStudent) {
        this.NumberOfStudent = NumberOfStudent;
    }

    public boolean isCollected() {
        return collected;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    @Override
    public String toString() {
        return "Paper{" + "PaperTitle=" + PaperTitle + ", PaperIdNumber=" + PaperIdNumber + ", CourseCode=" + CourseCode + ", CourseIncharge=" + CourseIncharge + ", Smester=" + Smester + ", ProgramName=" + ProgramName + ", TypeOfExam=" + TypeOfExam + ", invigilator=" + invigilator + ", loaction=" + loaction + ", date=" + date + ", time=" + time + ", NumberOfStudent=" + NumberOfStudent + ", collected=" + collected + '}';
    }

    
    
}