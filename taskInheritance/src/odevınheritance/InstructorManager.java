/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odevınheritance;

public class InstructorManager extends UserManager
{
    public void defineTask(Instructor user, Course course)
    {
        System.out.println(" defined a new task by  " +user.getFirstName()+ " "
                +user.getLastName());
    }
}
