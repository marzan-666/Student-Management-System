package FinalProject;


import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        screenClear();
        Scanner input=new Scanner(System.in);
        int choice;
        username();
        while(true){
            screenClear();
            for(int i=0;i<20;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  STUDENT?? ...................... Press 1");
            System.out.println("\t\t\t\t\t\t\t\t  FACULTY?? ...................... Press 2");
            System.out.println("\t\t\t\t\t\t\t\t  LIBRARY?? ...................... Press 3");
            System.out.println("\t\t\t\t\t\t\t\t  TUTUION FEE?? .................. Press 4");
            System.out.println("\t\t\t\t\t\t\t\t  IT DEPARTMENT?? ................ Press 5");
            System.out.println("\t\t\t\t\t\t\t\t  EXIT?? ......................... Press 0");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    student();
                    break;
                case 2:
                    faculty();
                    break;
                case 3:
                    library();
                    break;
                case 4:
                    tutionFee();
                    break;
                case 5:
                    itDepartment();
                    break;
            }
            if(choice==0){
                break;
            }
        }
    }
    public static void username(){
        Scanner input=new Scanner(System.in);
        String user,user1="username";
        while(true){
            for(int i=0;i<15;i++){
                System.out.println();
            }
            System.out.print("\t\t\t\t\t\t\t\t  ENTER USERNAME : ");
            user=input.next();
            if(user.equals(user1)==true){
                screenClear();
                password(user);
                break;
            }
            else{
                screenClear();
                System.out.println("\n\n\n\t\t\t\t\t\t\t\t  WRONG USERNAME!!!!");
            }
        }
    }
    public static void password(String user){
        Scanner input=new Scanner(System.in);
        String pass,pass1="123456";
        while(true){
            for(int i=0;i<15;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  ENTER USERNAME : "+user);
            System.out.print("\t\t\t\t\t\t\t\t  ENTER PASSWORD : ");
            pass=input.next();
            if(pass.equals(pass1)==true){
                break;
            }
            else{
                screenClear();
                System.out.println("\n\n\n\t\t\t\t\t\t\t\t  WRONG PASSWORD!!!!");
            }
        }
    }
    public static void student() throws FileNotFoundException{
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner in=new Scanner(System.in);
        int n;
        while(true){
            for(int i=0;i<5;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  ADD STUDENT?? ............... Press 1");
            System.out.println("\t\t\t\t\t\t\t\t  SEARCH STUDENT?? ............ PRESS 2");
            System.out.println("\t\t\t\t\t\t\t\t  DELETE STUDENT?? ............ Press 3");
            System.out.println("\t\t\t\t\t\t\t\t  SHOW ALL STUDNET?? .......... Press 4");
            System.out.println("\t\t\t\t\t\t\t\t  SHOW CGPA?? ................. Press 5");
            System.out.println("\t\t\t\t\t\t\t\t  EXIT?? ...................... Press 0");
            n=in.nextInt();
            switch(n){
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    allStudentDetails();
                    break;
                case 5:
                    showCGPA();
                    break;
            }
            if(n==0){
                break;
            }
        }
    }
    public static void faculty(){
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner in=new Scanner(System.in);
        int n;
        while(true){
            for(int i=0;i<5;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  ADD FACULTY?? ................ Press 1");
            System.out.println("\t\t\t\t\t\t\t\t  FACULTY DETAILS?? ............ Press 2");
            System.out.println("\t\t\t\t\t\t\t\t  SUBMIT STUDENT GRADE ......... Press 3");
            System.out.println("\t\t\t\t\t\t\t\t  EXIT?? ....................... Press 0");
            n=in.nextInt();
            switch(n){
                case 1:
                    addFaculty();
                    break;
                case 2:
                    facultyDetails();
                    break;
                case 3:
                    gradeSubmit();
                    break;
            }
            if(n==0){
                break;
            }
        }
    }
    public static void library(){
        screenClear();
        for(int i=0;i<15;i++){
           System.out.println();
        }
        
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            for(int i=0;i<5;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  ADD NEW BOOK?? ............... Press 1");
            System.out.println("\t\t\t\t\t\t\t\t  SHOW ALL BOOK?? .............. Press 2");
            System.out.println("\t\t\t\t\t\t\t\t  SEARCH BOOK?? ................ Press 3");
            System.out.println("\t\t\t\t\t\t\t\t  CALCULATE FINE?? ............. Press 4");
            System.out.println("\t\t\t\t\t\t\t\t  EXIT?? ....................... Press 0");
            n=sc.nextInt();
            switch(n){
                case 1:
                    addBooks();
                    break;
                case 2:
                    showAllBooks();
                    break;
                case 3:
                    showBookDetails();
                    break;
                case 4:
                    fine();
                    break;
            }
            if(n==0)
                break;
        }
    }
    public static void addStudent(){
        screenClear();
        for(int i=0;i<10;i++){
           System.out.println();
        }
        Scanner input=new Scanner(System.in);
        String name,id,depart,phono;
        System.out.print("\t\tENTER STUDENT NAME  \t\t: ");
        name=input.nextLine();
        System.out.print("\t\tENTER STUDENT ID \t\t: ");
        id=input.next();
        System.out.print("\t\tENTER DEPARTMENT \t\t: ");
        depart=input.next();
        System.out.print("\t\tENTER STUDENT PHONE NO \t\t: ");
        phono=input.next();
        Student s=new Student(name,id,depart,phono);
        Student.addNewStudent(s);
        for(int i=0;i<3;i++){
            System.out.println();
        }
        System.out.println("\t\t\t\t\t\t\t\t  New Student record add successfully");
        
    }
    public static void deleteStudent() throws FileNotFoundException{
        screenClear();
        for(int i=0;i<16;i++){
            System.out.println();
        }
        Scanner input=new Scanner(System.in);
        String id;
        System.out.print("\t\t\t\t\tEnter student id for delete record : ");
        id=input.next();
        Student.deleteStudentRecord(id);

    }
    public static void searchStudent(){
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner input=new Scanner(System.in);
        String id;
        System.out.print("\t\t\t\t\t\t\t\t  Enter student id for see details : ");
        id=input.next();
        System.out.println();
        System.out.println();
        Student.showStudentDetails(id);
    }
    public static void allStudentDetails(){
        screenClear();
        for(int i=0;i<10;i++){
            System.out.println();
        }
        Student.showAllStudentsDetails();
    }
    public static void addFaculty(){
        screenClear();
        for(int i=0;i<12;i++){
            System.out.println();
        }
        Scanner input=new Scanner(System.in);
        String name,id,depart,phono,course;
        System.out.print("\t\t\t\tENTER FACULTY NAME \t\t: ");
        name=input.nextLine();
        System.out.print("\t\t\t\tENTER ID \t\t: ");
        id=input.next();
        System.out.print("\t\t\t\tENTER DEPARTMENT \t: ");
        depart=input.next();
        System.out.print("\t\t\t\tENTER PHONE NO \t\t: ");
        phono=input.next();
        System.out.print("\t\t\t\tENTER COURSE NAME \t: ");
        course=input.next();
        Faculty f=new Faculty(name,id,depart,phono,course);
        Faculty.addNewFaculty(f);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t  New Faculty Details add successfully!!!!");
        System.out.println();
        System.out.println();
    }
    public static void facultyDetails(){
        screenClear();
        for(int i=0;i<10;i++){
            System.out.println();
        }
        Faculty.FacultyDetails();
        System.out.println();
        System.out.println();
    }
    public static void gradeSubmit(){
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner input=new Scanner(System.in);
        String id;
        double grade,credit;
        System.out.print("\t\t\t\t\t\t\t\t  ENTER STUDENT ID FOR GRADE SUBMISSION : ");
        id=input.next();
        System.out.print("\t\t\t\t\t\t\t\t  ENTER GRADE : ");
        grade=input.nextDouble();
        System.out.print("\t\t\t\t\t\t\t\t  ENTER COURSE CREDIT : ");
        credit=input.nextDouble();
        System.out.println();
        System.out.println();
        System.out.println();
        Faculty.SubmitGrade(id, grade,credit);
        System.out.println();
        System.out.println();
    }
    public static void addBooks(){
        screenClear();
        for(int i=0;i<10;i++){
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t ENTER BOOK NAME\t\t: ");
        String bName=sc.nextLine();
        System.out.print("\t\t\t\t\t\t\t ENTER AUTHOR\t\t\t: ");
        String auth=sc.nextLine();
        System.out.print("\t\t\t\t\t\t\t ENTER CATEGORY\t\t\t: ");
        String cat=sc.nextLine();
        System.out.print("\t\t\t\t\t\t\t ENTER BOOK IDt\t\t: ");
        String id=sc.nextLine();
        System.out.print("\t\t\t\t\t\t\t ENTER RACK NO\t\t\t: ");
        String rNo=sc.nextLine();
        System.out.print("\t\t\t\t\t\t\t ENTER QUANTITY\t: ");
        String bQnty=sc.nextLine();
        
        Library l=new Library(bName,auth,cat,id,rNo,bQnty);
        Library.addBooks(l);
    }
    public static void showAllBooks(){
        screenClear();
        for(int i=0;i<10;i++){
            System.out.println();
        }
        Library.showAllBooks();
    }
    public static void showBookDetails(){
        screenClear();
        System.out.println("ENTER BOOK ID: ");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        Library.showBookDetails(n);
    }
    public static void fine(){
        screenClear();
        Library.fine();
    }
    public static void tutionFee(){
        screenClear();
        for(int i=0;i<16;i++){
            System.out.println();
        }
        Scanner in=new Scanner(System.in);
        int k;
        while(true){
            for(int i=0;i<5;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  SEMESTER FEE CALCULATE?? .............. Press 1");
            System.out.println("\t\t\t\t\t\t\t\t  TOTAL FEE CALCULATE?? ................. Press 2");
            System.out.println("\t\t\t\t\t\t\t\t  EXIT?? ................................ Press 0");
            k=in.nextInt();
            switch(k){
                case 1:
                    semesterfee();
                    break;
                case 2:
                    totalfee();
                    break;
            }
            if(k==0)
                break;
        }
    }
    public static void semesterfee(){
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner in=new Scanner(System.in);
        int credit;
        System.out.print("\t\t\t\t\t\t\t\t  ENTER SEMESTER CREDIT : ");
        credit=in.nextInt();
        System.out.println();
        System.out.println();
        TutionFee t=new TutionFee(credit);
        TutionFee.semesterFee(t);
    }
    public static void totalfee(){
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        TutionFee.totalFee();
    }
    public static void itDepartment() throws FileNotFoundException{
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner input=new Scanner(System.in);
        int x;
        while(true){
            for(int i=0;i<5;i++){
                System.out.println();
            }
            System.out.println("\t\t\t\t\t\t\t\t  MODIFY STUDENT DETAILS?? ..............Press 1");
            System.out.println("\t\t\t\t\t\t\t\t  EDIT CGPA?? ...........................Press 2");
            System.out.println("\t\t\t\t\t\t\t\t  EXIT?? ................................Press 0");
            x=input.nextInt();
            switch(x){
                case 1:
                    modifyStudent();
                    break;
                case 2:
                    editCGPA();
                    break;
            }
            if(x==0){
                break;
            }
        }
    }
    public static void modifyStudent() throws FileNotFoundException{
        screenClear();
        for(int i=0;i<10;i++){
            System.out.println();
        }
        Scanner inpu=new Scanner(System.in);
        String id;
        System.out.print("\t\t\t\t\t\t\t\t  ENTER STUDENT ID FOR MODIFY IFORMATION : ");
        id=inpu.next();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t  ENTER NEW IFORMATION FOR ID: "+id+"\n\n\n");
        inpu.nextLine();
        System.out.print("\t\tENTER STUDENT NAME \t\t: ");
        String name=inpu.nextLine();
        System.out.print("\t\tENTER STUDENT ID \t\t: ");
        String id1=inpu.next();
        System.out.print("\t\tENTER STUDENT DEPARTENT \t: ");
        String depart=inpu.next();
        System.out.print("\t\tENTER STUDENT PHONE NO \t\t: ");
        String phono=inpu.next();
        Student s=new Student(name,id1,depart,phono);
        System.out.println();
        System.out.println();
        System.out.println();
        ItDepartment.ModifyStudentDetails(id,s);
    }
    public static void editCGPA(){
        screenClear();
        for(int i=0;i<15;i++){
            System.out.println();
        }
        Scanner in=new Scanner(System.in);
        String id;
        double grade,credit;
        System.out.print("\t\t\t\t\t\t\t\t  ENTER STUDENT ID FOR EDIT CGPA : ");
        id=in.next();
        System.out.print("\n\n\t\t\t\t\t\t\t\t  ENTER ACCURATE CGPA FOR ID "+id+" : ");
        grade=in.nextDouble();
        System.out.print("\t\t\t\t\t\t\t\t  ENTER COMPELTED CREDIT FOR ID "+id+" : ");
        credit=in.nextDouble();
        System.out.println();
        System.out.println();
        System.out.println();
        ItDepartment.editgrade(id,grade,credit);
    }
    public static void showCGPA(){
        screenClear();
        for(int i=0;i<18;i++){
            System.out.println();
        }
        Scanner input=new Scanner(System.in);
        String id;
        System.out.print("\t\t\t\t\t\t\t\t  ENTER STUDENT ID FOR SEE CGPA : ");
        id=input.next();
        System.out.println();
        System.out.println();
        ItDepartment.showCGPA(id);
    }
    public static void screenClear(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        }catch(Exception e){}
    }
}
