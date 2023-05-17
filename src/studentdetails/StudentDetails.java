
package studentdetails;


public class StudentDetails {

    
    public static void main(String[] args) {
      
        Student[] list = new Student[2];
        
        Student s1 = new Student();
        s1.setName("Aryan");
        s1.setAge(18);
        
        Student s2 = new Student();
        s2.setName("Adam");
        s2.setAge(19);
        
        list[0] = s1;
        list[1] = s2;
        
        System.out.println(list[0].getName() + " " + list[0].getAge());
        
        System.out.println(list[1].getName() + " " + list[1].getAge());
        
        System.out.println("Modifications");
    }
    
}
