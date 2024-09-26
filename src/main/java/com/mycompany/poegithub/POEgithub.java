/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poegithub;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author B.O.N.N.Y
 */
public class POEgithub {

    public static void main(String[] args) {
           //Login instance
           Login login_checks = new Login();
           
           // object for a scanner
        Scanner sc = new Scanner(System.in);
       
        
         //declare variables
        String username = "";
        String password = "";
        
          //Promting the user for username and password
          //use do while
        do{
            //prompt
            System.out.println("Enter username");
            username = sc.nextLine();
        }while( !login_checks.checkUserName());
        
        //user do while for password
        do{
            //prompt
            System.out.println("Enter password: ");
            password = sc.nextLine();
        }while(!login_checks.checkPaswordComplexity());
        
       
           
    }
       
           
           
    
}

