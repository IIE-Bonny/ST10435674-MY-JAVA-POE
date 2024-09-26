/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poegithub;

import java.util.regex.Pattern;

/**
 *
 * @author B.O.N.N.Y
 */
public class Login {
    
     //declare variables
        String username = "";
        String password = "";
    
    
    //check username method
    public boolean checkUserName(){
       //temp variable for checking
        boolean Found = false;
        
        // check username
        if(username.contains("_")){
            //assign to false
            Found = false;
            //messsage
            System.out.println("Useername not captured!!");
            
        }else{
            //then assign to true
            Found = true;
            System.out.println("Username is captured!!");
        }
        
        return Found;
    }
    
    //check password complexity method
    public boolean checkPaswordComplexity(){
        
         //pattern regex
        Pattern check_num = Pattern.compile(" [0123456789] ");
        Pattern check_special = Pattern.compile(" [*-`~!@#$&_'^] ");
        Pattern check_Upper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        
        //temp variable Found
        boolean Found = false;
        
        //check all here
        if( check_num.matcher(password).find() && check_special.matcher(password) .find() && check_Upper.matcher(password) .find() && password.length() >= 8){
            
            //assign true
            Found = true;
            //message
            System.out.println("Password is captured!!");
        }else{
            //assign to false
            Found = false;
            //message
            System.out.println("Password not captured!!");
        }
        
        return Found;
        
    }
}