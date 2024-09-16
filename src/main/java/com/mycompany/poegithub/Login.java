/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poegithub;

import java.util.Scanner;

/**
 *
 * @author B.O.N.N.Y
 */
public class Login {
    private String Name;
    private String Lastname;
    private String password;
    
    private String pswnum = "0";
    private String pswnum1= "1";
    private String pswnum2= "2";
    private String pswnum3= "3";
    private String pswnum4= "4";
    private String pswnum5= "5";
    private String pswnum6= "6";
    private String pswnum7= "7";
    private String pswnum8= "8";
    private String pswnum9= "9";
    
    
    
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
        if(password.contains(pswnum) || password.contains(pswnum1) || password.contains(pswnum2) || password.contains(pswnum3) || password.contains(pswnum4) || password.contains(pswnum5) || password.contains(pswnum6) || password.contains(pswnum7)  || password.contains(pswnum8) || password.contains(pswnum9)){
            System.out.println("Password must have atleast 1 number");
            
        }
        return false;
    }
            
    
    
    
}
