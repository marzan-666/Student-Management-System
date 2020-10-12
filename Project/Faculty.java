package FinalProject;

import java.io.*;
import java.util.*;

public class Faculty extends Person{
    private final String Department;
    private String Phono;
    private String courseName;
    //private double grade;
    public Faculty(String name,String id,String Department,String Phono,String courseName){
        super(name,id);
        this.Department=Department;
        this.Phono=Phono;
        this.courseName=courseName;
    }
    public String getDepartment(){
        return Department;
    }
    public String getPhono(){
        return Phono;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setPhono(String Phono){
        this.Phono=Phono;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public static void addNewFaculty(Faculty f1){
        File faculty=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\faculty.txt");
        File DIPC=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIPC.txt");
        if(faculty.exists()==true){
            try{
                FileWriter fw=new FileWriter(faculty,true);
                FileWriter fw1=new FileWriter(DIPC,true);
                PrintWriter pw=new PrintWriter(fw);
                PrintWriter pw1=new PrintWriter(fw1);
                pw.println(f1.getName());
                pw1.println(f1.getId()+" "+f1.getDepartment()+" "+f1.getCourseName()+" "+f1.getPhono());
                pw.close();
                pw1.close();
            }catch(Exception e){
                
            }
        }
        else{
            try{
                PrintWriter pw=new PrintWriter(faculty);
                PrintWriter pw1=new PrintWriter(DIPC);
                pw.println(f1.getName());
                pw1.println(f1.getId()+" "+f1.getDepartment()+" "+f1.getCourseName()+" "+f1.getPhono());
                pw.close();
                pw1.close();
            }catch(Exception e){
                
            }
        }
    }
    public static void FacultyDetails(){
        File faculty=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\faculty.txt");
        File DIPC=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIPC.txt");
        if(faculty.exists()==true){
            try{
                Scanner sc=new Scanner(faculty);
                Scanner sc1=new Scanner(DIPC);
                while(sc.hasNext()&&sc1.hasNext()){
                    String name=sc.nextLine();
                    String id=sc1.next();
                    String depart=sc1.next();
                    String cname=sc1.next();
                    String phno=sc1.next();
                    System.out.println("\t\tName \t\t: "+name+"\n\t\tId \t\t: "+id+"\n\t\tDepartment \t: "+depart+"\n\t\tCourse name \t: "+cname+"\n\t\tPhone no \t: "+phno);
                    System.out.println();
                    System.out.println();
                }
            }catch(Exception e){
                
            }
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t  No Faculty Reccord Found !!!!");
        }
    }
    public static void SubmitGrade(String id,double grade,double credit){
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        File Grade=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Grade.txt");
        File g=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\g.txt");
        int count=0;
        if(Grade.exists()==true){
            try{
                Scanner inpu1=new Scanner(DIP);
                Scanner inpu2=new Scanner(Grade);
                PrintWriter pw1=new PrintWriter(g);
                while(inpu1.hasNext()&&inpu2.hasNext()){
                    String Id=inpu1.next();
                    String depart=inpu1.next();
                    String phono=inpu1.next();
                    double gra=inpu2.nextDouble();
                    double cre=inpu2.nextDouble();
                    if(id.equals(Id)==true){
                        if(gra>0){
                            double gpa;
                            gpa=((gra*cre)+(grade*credit))/(cre+credit);
                            pw1.println(gpa+" "+(cre+credit));
                        }
                        else if(gra==0){
                            pw1.println(grade+" "+credit);
                        }
                        count++;
                    }
                    else{
                        pw1.println(gra+" "+cre);
                    }
                }
                inpu1.close();
                inpu2.close();
                pw1.close();
            }catch(Exception e){
                
            }
            File f1=new File(Grade.getName());
            Grade.delete();
            g.renameTo(f1);
        }
        if(count==1){
            System.out.println("\t\t\t\t\t\t\t\t  Grade submit successfully");
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t  No student Found For Id : "+id);
        }
    }
}
