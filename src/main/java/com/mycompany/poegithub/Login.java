/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poegithub;
import java.util.regex.Matcher;
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
         //Initialized result variable
        String result = "";
        //check if username has uderscore
        if (!checkUserName(username)){
            //message
            result = "The username is incorrectly formatted!";
        }        
        else if(!checkPasswordComplexity(password)){
            //message
            result = "The password does not meet the password complexity requirements"; 
        }
        else{
            //message
            result = "The user has been registered successfully";
            //constructors
            this.firstname = firstname;
            this.lastname = lastname;
            this.username = username;
            this.password = password;
        }
        
            return result;
           
        }
    
    //check password complexity method
    public boolean checkPasswordComplexity(String password){
        
      //password must be at least 8 characters long
      if(password.length() < 8){
          return false;
      }
        //initialized boolean variables
      boolean hasUpperCase = false;
      boolean hasNumber = false;
      boolean hasSpecialChar = false;
      
      //Regex to find special characters
      Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
      Matcher matcher = specialCharPattern.matcher(password);
      
      for(int i = 0; i < password.length(); i++){
          char c = password.charAt(i);
          if(Character.isUpperCase(c)){
              //assign isUpperCase to true
              hasUpperCase = true;
          }
          if(Character.isDigit(c)){
              //assign isDigit to true
              hasNumber = true;
          }
          if(matcher.find()){
              //message
              System.out.println("Password Captured");
              //assign hasSpecialChar to true
              hasSpecialChar = true;
          }
      }
      
      return hasUpperCase && hasNumber && hasSpecialChar;
      /* 
         //pattern regex
        Pattern check_num = Pattern.compile(" [0123456789] ");
        Pattern check_special = Pattern.compile(" [~`!@#$%&*()_+=';-] ");
        Pattern check_Upper = Pattern.compile("[A-Za-z]+");

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
        */
    }
    
    public boolean loginUser(String username, String password){
        //Initialized login_Result variable
        boolean login_Result = false;
        //check if username and password matches 
        if(username.matches(username) && password.matches(password)){
            // message
            System.out.println("Login details match!!");
            // assign to true
            login_Result = true;
            
        }else{
             //message
              System.out.println("Login details do not match login details stored when registered!!");
             //assign to false
            login_Result = false;
            
        }
        
           return login_Result;
        
    }
    
    public String returnLoginStatus(String firstname, String lastname, String username, String password){
       // Initialized outcome variable
        String outcome ="";
        //check if login is successful
        if(loginUser(username, password)){
        outcome = "A successful Login, Welcome "+firstname+lastname;
        }else{
        outcome  = "A failed Login";
            }      
            return outcome;
}
}
