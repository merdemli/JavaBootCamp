
package odevınheritance;

public class StudentManager extends UserManager
{
    public void addCourse(User user, Course course)
    {
        System.out.println(course.getCourseName()+ 
                " Added to the system by a user with " + user.getUserId()+ " id "
                );
    }
    
    
}
