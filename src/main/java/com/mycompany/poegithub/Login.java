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
        private String  username = "";
        private String  password = "";
        private boolean UserFound = false;
        private boolean PassFound = false;
    
    
    //check username method
    public boolean checkUserName(){
       //temp variable for checking
         this.UserFound= false;
        
        // check username
        if(username.contains("_") && username.length() >= 5){
            //assign to true
            UserFound = true;
        }else{
            RegisterUser();
        }
        
        return true;
    }
    
    //Message return method
    public String RegisterUser(){
            //if Username / UserFound is false
        if(UserFound = false){
            //message
        System.out.println("Username incorrectly formatted please ensure that");
        
        }else if(PassFound = false){
            System.out.println("Password does not meet complexity requirements");
        }
            return null;
           
        }
    
    //check password complexity method
    public boolean checkPasswordComplexity(){
        
         //pattern regex
        Pattern check_num = Pattern.compile(" [0123456789] ");
        Pattern check_special = Pattern.compile(" [*-`~!@#$&_'^] ");
        Pattern check_Upper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        
        //temp variable Found
         this.PassFound = false;
        
        //check all here
        if( check_num.matcher(password).find() && check_special.matcher(password) .find() && check_Upper.matcher(password) .find() && password.length() >= 8){
            
            //assign true
            PassFound = true;
            //message
            System.out.println("Password is captured!!");
        }else{
            //assign to false
            PassFound = false;
            //message
            System.out.println("Password not captured!!");
        }
        
        return true;
        
    }
    
    public boolean loginUser(){
        
            return true;
        
    }
    
}