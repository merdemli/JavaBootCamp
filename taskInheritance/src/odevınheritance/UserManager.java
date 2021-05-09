
package odevınheritance;

public class UserManager {
    
    public void add(User user)
    {
        System.out.println(+user.getUserId()+ " id'li kullanıcı sisteme eklendi:" );
        
    }
    public void addMultiple(User[]users)
    {
        //bulk insert
        for (User user : users)
        {
            add(user);
            
        }
    
    }
    
}
