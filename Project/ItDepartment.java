package FinalProject;

import java.util.*;
import java.io.*;
public class ItDepartment {
    public ItDepartment(){}
    public static void ModifyStudentDetails(String stid,Student st) throws FileNotFoundException{
        File student=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\student.txt");
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        File Grade=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Grade.txt");
        File s=new File("C:C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\asf.txt");
        File d=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\dfg.txt");
        File g=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\hjk.txt");
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
                        pw.println(st.getName());
                        pw1.println(st.getId()+" "+st.getDepartment()+" "+st.getPhono());
                        pw2.println(grade+" "+credit);
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
        String st1=student.getName();
        student.delete();
        
        String di=DIP.getName();
        DIP.delete();
        
        File f3=new File(Grade.getName());
        Grade.delete();
        g.renameTo(f3);
        
        File f=new File(st1);
        s.renameTo(f);
        
        File f1=new File(di);
        d.renameTo(f1);
        
        if(count==1){
            System.out.println("\t\t\t\t\t\t\t\t  Student record updated for id : "+stid);
        }
        else
            System.out.println("\t\t\t\t\t\t\t\t  No record found for updated!!!");
    }
    public static void editgrade(String id,double grade,double credit){
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        File Grade=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Grade.txt");
        File g=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\asdj.txt");
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
                        pw1.println(grade+" "+credit);
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
            System.out.println("\t\t\t\t\t\t\t\t  Grade updated successfully");
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t  No student Found For Id : "+id);
        }
    }
    public static void showCGPA(String id){
        File DIP=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\DIP.txt");
        File Grade=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\Grade.txt");
        int count=0;
        if(Grade.exists()==true){
            try{
                Scanner inpu1=new Scanner(DIP);
                Scanner inpu2=new Scanner(Grade);
                while(inpu1.hasNext()&&inpu2.hasNext()){
                    String Id=inpu1.next();
                    String depart=inpu1.next();
                    String phono=inpu1.next();
                    double gra=inpu2.nextDouble();
                    double cre=inpu2.nextDouble();
                    if(id.equals(Id)==true){
                        System.out.println("\t\t\t\t\t\t\t\t  CGPA is \t:\t "+gra);
                        count++;
                    }
                }
                inpu1.close();
                inpu2.close();
            }catch(Exception e){
                
            }
        }
        if(count==1){
            System.out.println("\t\t\t\t\t\t\t\t  CGPA has been shown");
        }
        else{
            System.out.println("\t\t\t\t\t\t\t\t  No student Found For show CGPA ");
        }
    }
}
