package FinalProject;


public class Person {
    private String name;
    private String id;
    public Person(String name,String id){
        this.name=name;
        this.id=id;
    }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\n"+"Id: "+id+"\n";
    }
}
