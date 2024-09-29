/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poegithub;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author B.O.N.N.Y
 */
public class LoginTest {
    

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "Kyl_1";
        Login instance = new Login();
        
        System.out.print("Welcome <user first name>, <user last name> it is great to see you ");
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testInvalidCheckUserName() {
        System.out.println("checkUserName");
        String username = "Kyle!!!";
        Login instance = new Login();
        
        System.out.println("Username is not correctly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length");
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of RegisterUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("RegisterUser");
        String firstname = "";
        String lastname = "";
        String username = "";
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.RegisterUser(firstname, lastname, username, password);
        
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99";
        Login instance = new Login();
        
        System.out.println("Password successfuly captured");
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testInvalidCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99";
        Login instance = new Login();
        
        System.out.println("Password not formatted correctly, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        
        
        boolean expResult = true;
        boolean result = instance.loginUser(username, password);
        
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testInvalidLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        
        
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String firstname = "";
        String lastname = "";
        String username = "";
        String password = "";
        Login instance = new Login();
        
        
        String expResult = "";
        String result = instance.returnLoginStatus(firstname, lastname, username, password);
        
        assertEquals(expResult, result);
        
    }
    
}
