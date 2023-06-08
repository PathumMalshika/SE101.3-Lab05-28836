/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Lab User
 */
public class Interfaceimplemented implements MyFirstInterface
{
    public void display()
    {
        System.out.println("value is:"+x);  //The value cannot be change because it has already declared as final variable.
    }
}
