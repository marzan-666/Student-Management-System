package FinalProject;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahadi Hasan Sagor
 */
public class TutionFee {
    private static final double CREDIT_FEE=5500.00;
    private static final double LAB_FEE=2000.00;
    private static final double LIBRARY_FEE=500.00;
    private static final double STUDENT_ACTIVITIES=1500.00;
    private static int creditCount=0;
    private static final int TOTAL_SEMESTER=12;
    private static int totalCredit;
    
    /*public TutionFee(){
        
    }*/
    public TutionFee(int creditCount){
    
        this.creditCount=creditCount;
        
    }
    public int getCreditCount(){
    
        return creditCount;
    }
    public static void semesterFee(TutionFee t){
        
        double f=creditCount*CREDIT_FEE;
        double finalFee=((creditCount*CREDIT_FEE)+LAB_FEE+LIBRARY_FEE+STUDENT_ACTIVITIES);
        System.out.println("\t\t\t\t\t\t\t\t  Your semester fee is: \n\n");
        System.out.println("\t\t\t\t\t\t\t\t  ACADEMIC FEE\t\t:\t"+f);
        System.out.println("\t\t\t\t\t\t\t\t  LAB FEE\t\t:\t"+LAB_FEE);
        System.out.println("\t\t\t\t\t\t\t\t  LIBRARY FEE\t\t:\t"+LIBRARY_FEE);
        System.out.println("\t\t\t\t\t\t\t\t  STUDENT ACTIVITIES\t:\t\t"+STUDENT_ACTIVITIES);
        System.out.println("\t\t\t\t\t\t\t\t  -------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t  TOTAL\t\t\t\t"+finalFee);
    }
    
    public static void totalFee(){
    
        System.out.print("\t\t\t\t\t\t\t\t  Enter total credit : ");
        Scanner sc=new Scanner(System.in);
        totalCredit=sc.nextInt();
        double total=((totalCredit*CREDIT_FEE)+((LAB_FEE+LIBRARY_FEE+STUDENT_ACTIVITIES)*12));
        
        System.out.println("\n\t\t\t\t\t\t\t\t  Credit: "+totalCredit);
        System.out.println("\t\t\t\t\t\t\t\t  Semeter: "+TOTAL_SEMESTER);
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t  ACADEMIC FEE\t\t: "+CREDIT_FEE+" X "+totalCredit+" = "+(totalCredit*CREDIT_FEE));
        System.out.println("\t\t\t\t\t\t\t\t  LAB FEE\t\t:\t\t"+LAB_FEE);
        System.out.println("\t\t\t\t\t\t\t\t  LIBRARY FEE\t\t:\t\t"+LIBRARY_FEE);
        System.out.println("\t\t\t\t\t\t\t\t  STUDENT ACTIVITIES\t:\t\t"+STUDENT_ACTIVITIES);
        System.out.println("\t\t\t\t\t\t\t\t  -------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t  TOTAL\t\t\t\t"+total);
        
        
    }
}
