/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poegithub;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author B.O.N.N.Y
 */
public class Login {
    Scanner sc = new Scanner(System.in);
    
    private String Name;
    private String Username;
    private String password;
    
    
    
    
    public boolean checkUserName(){
        if(!Name.contains("_") && Name.length() > 5){
            return false;
        }
        return true;
    }
    
    public boolean checkPaswordComplexity(){
           //check if password is at least 8 characters long
       if(password.length() < 8){
           return false;
       }
       else{
           System.out.print("Password must atleast be 8 characters long");
       }
        return false;  
    }
            
    
    
    
}
