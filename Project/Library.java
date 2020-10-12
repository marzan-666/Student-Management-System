package FinalProject;

import java.io.File;
import java.io.*;
import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahadi Hasan Sagor
 */
public class Library {
    
    private String librarian;
    private String bookName;
    private String author;
    private String bookCategory;
    private String bookID;
    private String rackNo;
    private String quantity;
    private static int firstDate;
    private static int lastDate;
    private static final int FIXED_DAY=15;
    public static final double FINE=20; 
    private int fine;
    
    
    Library(){}
    
    public Library(String bookName,String author,String bookCategory,String bookID,String rackNo,String quantity){
        
        this.librarian=librarian;
        this.bookName=bookName;
        this.author=author;
        this.bookCategory=bookCategory;
        this.bookID=bookID;
        this.rackNo=rackNo;
        this.quantity=quantity;
    
    }
    public Library(int firstDate, int lastDate){
        this.firstDate=firstDate;
        this.lastDate=lastDate;    
    }
    public String getLibrarian(){
        
        return librarian;
    }
    public void setLibrarian(String librarian){
    
        this.librarian=librarian;
    }
    public String getBookName(){
    
        return bookName;
    }
    public String getAuthor(){
    
        return author;
    }
    public String getBookCategory(){
    
        return bookCategory;
    }
    public String getBookID(){
    
        return bookID;
    }
    public String getRackNo(){
    
        return rackNo;
    }
    public String getQuantity(){
    
        return quantity;
    }
    public void setQuantity(String quantity){
    
        this.quantity=quantity;
    }
    public int getFine(){
    
        return fine;
    }
    public static void addBooks(Library s) {        
        
        File file=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\books.txt");
        
        if(file.exists()){
        
            try{
                FileWriter fwrt=new FileWriter(file,true);
                PrintWriter pwrt=new PrintWriter(fwrt);
                
                //String lib=s.getLibrarian();
                String bName=s.getBookName();
                String auth=s.getAuthor();
                String bookCat=s.getBookCategory();
                String bkID=s.getBookID();
                String bRack=s.getRackNo();
                String bQ=s.getQuantity();
                
                String nu="0";
                //pwrt.println(lib);
                pwrt.println(bName);
                pwrt.println(auth);
                pwrt.println(bookCat);
                pwrt.println(bkID);
                pwrt.println(bRack);
                pwrt.println(bQ);           
                
                pwrt.close();
            }catch(Exception e){
                
            }
        }
        else{
            try{
                PrintWriter pwrt=new PrintWriter(file);
                
                //String lib=s.getLibrarian();
                String bName=s.getBookName();
                String auth=s.getAuthor();
                String bookCat=s.getBookCategory();
                String bkID=s.getBookID();
                String bRack=s.getRackNo();
                String bQ=s.getQuantity();
                
                String nu="0";
                //pwrt.println(lib);
                pwrt.println(bName);
                pwrt.println(auth);
                pwrt.println(bookCat);
                pwrt.println(bkID);
                pwrt.println(bRack);
                pwrt.println(bQ);
                
                pwrt.close();
                
            }catch(Exception e){
                
            }
        } 
 
    }
    
    public static void showAllBooks(){
    
        File file =new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\books.txt");
        if(file.exists()){
        
            try{
            
                Scanner in=new Scanner(file);
                System.out.println("\t\t\t\tBook Name\tAuthor\t\tCategory\tBook ID\t\tRack No\t\tQuantity");
                System.out.println("\t\t\t\t----------------------------------------------------------------------------------------");
                while(in.hasNext()){
                
                    //String lib=in.nextLine();
                    String bName=in.nextLine();
                    String auth=in.nextLine();
                    String bookCat=in.nextLine();
                    String bkID=in.nextLine();
                    String bRack=in.nextLine();
                    String bQ=in.nextLine();                   
                        
                    System.out.println("\t\t\t\t"+bName+"\t\t"+auth+"\t\t"+bookCat+"\t\t"+bkID+"\t\t"+bRack+"\t\t"+bQ);
                
                }
            
            }catch(Exception e){}
        
        }
        else{
        
            System.out.println("NO FILE FOUND!!!!!");
        }

    }    
    public  static void showBookDetails(String id){
        File file=new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Fall 2017\\src\\FinalProject\\books.txt");
        
        int count=0;
        if(file.exists()){
            try{
                Scanner in=new Scanner(file);
                while(in.hasNext()){
                    String bName=in.nextLine();
                    String auth=in.nextLine();
                    String bookCat=in.nextLine();
                    String bkID=in.nextLine();
                    String bRack=in.nextLine();
                    String bQ=in.nextLine();
                    if(bkID.equals(id)==true){
                        System.out.println("Book Name: "+bName+"\nAuthor: "+auth+"\nBook Category: "+bookCat+"\nBook ID: "+bkID+"\nRack No: "+bRack+"\nQuantity: "+bQ);
                        count++;
                        break;
                    }
                    
                }
            }catch(Exception e){
            
            }
        }
        if(count==0){
            System.out.println("No Student record Found for id : "+id);
        }
  
    }
    public static void fine(){
    
    
        System.out.println("Enter issue date: ");
        Scanner sc=new Scanner(System.in);
        firstDate=sc.nextInt();
        System.out.println("Enter return date: ");
        lastDate=sc.nextInt();
        
        if(firstDate<lastDate){
        
            int d=lastDate-firstDate;
            if(d>FIXED_DAY){
                
                int e=d-FIXED_DAY;
                double f=e*FINE;
                
                System.out.println("Your fine for "+e+" day/s delay is "+f+" \u09F3");
            }
            else{
            
                System.out.println("THANK YOU!\nYou are not FINED!!!!");
            }
            
        }
        else if(firstDate>lastDate){
        
            int d=((30-firstDate)+lastDate);
            if(d>FIXED_DAY){
                
                int e=d-FIXED_DAY;
                double f=e*FINE;
                
                System.out.println("Your fine for "+e+" day/s delay is "+f+" \u09F3");
            }
            else{
            
                System.out.println("THANK YOU!\nYou are not FINED!!!!");
            }
            
        }
        else if(firstDate==lastDate){
        
            double f=15*FINE;
            System.out.println("Your fine for 15 days delay is "+f+" \u09F3");
        
        }
        else{
        
            System.out.println("THANK YOU!\nYou are not FINED!!!!");
        }
           
    
    }

}
