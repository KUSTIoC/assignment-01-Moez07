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
public class ExamManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Paper p1=new Paper("Java",122,"JS213","Sir Ali Zeb","2nd","BSCS","Annual "," Sir M.Roman ","IT Department Room 4",12,9,80);
       Paper p2=new Paper("Programming",122,"CS213","Muhammad Roman","2nd","BSCS","Annual "," Sir Sana Ullah ","IT Department Room 1",13,9,70);
       Paper p3=new Paper("Discret Mathematics",122,"DM102","Shomaila Batool","2nd","BSCS","Annual "," Sir Nasir Khan ","Conference Room",14,9,150);
         System.out.println("\n"+p1);
         System.out.println(p2);
         System.out.println(p3);
        
         Course C1 = new Course ("Fall 2020", "F020","BSCS");
         Course C2 = new Course ("Spring 2020", "S220","BSSE");
         System.out.println("\n"+C1);
         System.out.println(C2);
                 
       
    }
    
}
