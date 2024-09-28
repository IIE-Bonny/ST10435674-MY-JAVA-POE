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
        private String firstname = "";
        private String lastname = "";
        private boolean UserFound = false;
        private boolean PassFound = false;
    
    
    //check username method
    public boolean checkUserName(String username){
       
        boolean result = false;
        
        if (username.contains("_") && username.length() <= 5){
            System.out.println("Username Captured");
            result = true;
        }
        else{
            System.out.println("Username not captured!");
            result = false;
        }
        
        // check username
        return result;
       
       
    }
    
    //Message return method
    public String RegisterUser(String firstname, String lastname, String username, String password){
         
        String result = "";
        if (!checkUserName(username)){
            result = "The username is incorrectly formatted!";
        }        
        else if(!checkPasswordComplexity(password)){
            result = "The password does not meet the password complexity requirements"; 
        }
        else{
            result = "The user has been registered successfully";
            this.firstname = firstname;
            this.lastname = lastname;
            this.username = username;
            this.password = password;
        }


        

/*
//if Username / UserFound is false
        if(UserFound = false){
            //message
        System.out.println("Username incorrectly formatted please ensure that");
        
        }else if(PassFound = false){
            System.out.println("Password does not meet complexity requirements");
        }

*/
            return result;
           
        }
    
    //check password complexity method
    public boolean checkPasswordComplexity(String password){
        
         //pattern regex
        Pattern check_num = Pattern.compile(" [0123456789] ");
        Pattern check_special = Pattern.compile(" [~`!@#$%&*()_+=';-] ");
//        Pattern check_Upper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        Pattern check_Upper = Pattern.compile("[A-Za-z]+");
//        Pattern check_special = Pattern.compile(".*[`~!@#$%&*()-_=+|[{]};:',<.>/?].*");
//        Pattern check_special = Pattern.compile ("[$&+,:;=?@#|'<>.-^*()%!]");
//        Pattern check_num = Pattern.compile(" [0-9] ");
        //temp variable Found
         this.PassFound = false;
        
        //check all here
        if( check_num.matcher(password).find() && check_special.matcher(password) .find() && check_Upper.matcher(password) .find() && password.length() >= 8){
            
            //message
            System.out.println("Password is captured!!");
            //assign true
            PassFound = true;
            
        }else{
               //message
            System.out.println("Password not captured!!");
            //assign to false
            PassFound = false;
         
        }
        
        return PassFound;
        
    }
    
    public boolean loginUser(){
        boolean loginResult = false;
        
            return true;
        
    }
    
}