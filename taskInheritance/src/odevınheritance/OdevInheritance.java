
package odevınheritance;

import java.util.HashSet;
import java.util.Set;

public class OdevInheritance {

    
    public static void main(String[] args)
    {   
        UserManager userManager = new UserManager();
        StudentManager studentManager =new StudentManager();
        UserManager instructorManager = new InstructorManager();
        
        Course java = new Course();
        java.setCourseName("Java");
        User user1 =new Student();
        user1.setUserId(1);
        User user4 =new Student();
        user4.setUserId(4);
        
        User user2 = new Instructor();
        user2.setUserId(3);
        User user3 = new User();
        user3.setUserId(3);
        
        User []users ={user1,user2,user3};
        
        userManager.addMultiple(users);
        studentManager.addCourse(user4, java);
        
        
        
        
        
    }
    
}
