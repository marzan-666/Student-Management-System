package FinalProject;


import java.io.File;
import java.io.*;
import java.util.*;

public class Student extends Person{
    private String Department;
    private String phono;
    public Student(String name,String id,String Department,String phono){
        super(name,id);
        this.Department=Department;
        this.phono=phono;
    }
    public String getDepartment(){
        return Department;
    }
    public void setDepartment(String Department){
        this.Department=Department;
    }
    public String getPhono(){
        return phono;
    }
    public void setPhono(String phono){
        this.phono=phono;
    }
    public static void addNewStudent(Student s){
        File student=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Student.txt");
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        File Grade=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Grade.txt");
        if(student.exists()==true){
            try{
                FileWriter fw=new FileWriter(student,true);
                FileWriter fw1=new FileWriter(DIP,true);
                FileWriter fw2=new FileWriter(Grade,true);
                PrintWriter pw=new PrintWriter(fw);
                PrintWriter pw1=new PrintWriter(fw1);
                PrintWriter pw2=new PrintWriter(fw2);
                String name=s.getName();
                String department=s.getDepartment();
                String id=s.getId();
                String phoneno=s.getPhono();
                String grade="0";
                String credit="0";
                pw.println(name);
                pw.close();
                pw1.println(id+" "+department+" "+phoneno);
                pw1.close();
                pw2.println(grade+" "+credit);
                pw2.close();
            }catch(Exception e){
                
            }
        }
        else{
            try{
                PrintWriter pw=new PrintWriter(student);
                PrintWriter pw1=new PrintWriter(DIP);
                PrintWriter pw2=new PrintWriter(Grade);
                String name=s.getName();
                String department=s.getDepartment();
                String id=s.getId();
                String phoneno=s.getPhono();
                String grade="0";
                String credit="0";
                pw.println(name);
                pw.close();
                pw1.println(id+" "+department+" "+phoneno);
                pw1.close();
                pw2.println(grade+" "+credit);
                pw2.close();
            }catch(Exception e){
                
            }
        }
        
    }
    public static void showAllStudentsDetails(){
        File student=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Student.txt");
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        if(student.exists()==true){
            try{
                Scanner input=new Scanner(student);
                Scanner input1=new Scanner(DIP);
                while(input.hasNext()&&input1.hasNext()){
                    String stname=input.nextLine();
                    String id=input1.next();
                    String depart=input1.next();
                    String phoneno=input1.next();
                    System.out.println("\t\tName \t\t\t: "+stname+"\n\t\tId \t\t\t: "+id+"\n\t\tDepartment \t\t: "+depart+"\n\t\tPhono no \t\t: "+phoneno);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                input.close();
                input1.close();
            }catch(Exception e){
            
            }
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t  No Student record Found!!!!!");
        }
    }
    public static void deleteStudentRecord(String stid) throws FileNotFoundException{
        File student=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Student.txt");
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        File Grade=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Grade.txt");
        File s=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\asf.txt");
        File d=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\dfg.txt");
        File g=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\src\\hjk.txt");
        int count=0;
        if(student.exists()==true){
            PrintWriter pw=new PrintWriter(s);
            PrintWriter pw1=new PrintWriter(d);
            PrintWriter pw2=new PrintWriter(g);
            Scanner input=new Scanner(student);
            Scanner input1=new Scanner(DIP);
            Scanner input2=new Scanner(Grade);
            try{
                while(input.hasNext()&&input1.hasNext()&&input2.hasNext()){
                    String stname=input.nextLine();
                    String id=input1.next();
                    String depart=input1.next();
                    String phoneno=input1.next();
                    double grade=input2.nextDouble();
                    double credit=input2.nextDouble();
                    if(id.equals(stid)==true){
                        count++;
                    }
                    else{
                        pw.println(stname);
                        pw1.println(id+" "+depart+" "+phoneno);
                        pw2.println(grade+" "+credit);
                    }
                    
                }
            }catch(Exception e){
            
            }
            pw.close();
            pw1.close();
            pw2.close();
            input.close();
            input1.close();
            input2.close();
        }
        String st=student.getName();
        student.delete();
        
        String di=DIP.getName();
        DIP.delete();
        
        File f3=new File(Grade.getName());
        Grade.delete();
        g.renameTo(f3);
        
        File f=new File(st);
        s.renameTo(f);
        
        File f1=new File(di);
        d.renameTo(f1);
        
        if(count==1){
            System.out.println("\t\t\t\t\t\t\t\t  Student record delete for id : "+stid);
        }
        else
            System.out.println("\t\t\t\t\t\t\t\t  No record found for delete!!!");
    }
    public static void showStudentDetails(String stid){
        File student=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Student.txt");
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        int count=0;
        if(student.exists()==true){
            try{
                Scanner input=new Scanner(student);
                Scanner input1=new Scanner(DIP);
                while(input.hasNext()&&input1.hasNext()){
                    String stname=input.nextLine();
                    String id=input1.next();
                    String depart=input1.next();
                    String phoneno=input1.next();
                    if(id.equals(stid)==true){
                        System.out.println("\t\t\t\t\t\t\t  Name \t\t\t: "+stname+"\n\t\t\t\t\t\t\t  Id \t\t\t: "+id+"\n\t\t\t\t\t\t\t  Department \t\t: "+depart+"\n\t\t\t\t\t\t\t  Phono no \t\t: "+phoneno);
                        count++;
                        break;
                    }
                    
                }
                input.close();
                input1.close();
            }catch(Exception e){
            
            }
        }
        if(count==0){
            System.out.println("\t\t\t\t\t\t\t\t  No Student record Found for id : "+stid);
        }
    }
}
