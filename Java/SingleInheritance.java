class Person{
    
    String name;
    int mobileno;

    void acceptdata(String name1,int mobile){
        name = name1;
        mobileno = mobile;
    }

    void displaydata(){
        System.out.println("Name= "+name+" Mobile No= "+mobileno);
    }
}

class Student extends Person{
    
    int rollno;
    String classname;
    double percentage;
    
    void acceptstudent(int rno,String cl,double per){
        rollno=rno;
        classname=cl;
        percentage=per;
    }

    void display(){
        displaydata();
        System.out.println("Roll no= "+rollno+" Class Name "+classname+" Percentage= "+percentage);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        
        Person p = new Person();
        Student s = new Student();
        
        s.acceptdata("ABC", 999);
        s.displaydata();
        s.acceptstudent(11, "FY", 90);
        s.display();
        p.acceptdata("PQR", 789);
        p.displaydata();
    
    }
}