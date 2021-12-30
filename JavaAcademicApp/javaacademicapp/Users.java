/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaacademicapp;

/**
 *
 * @author ACER
 */

import java.sql.Date;
public class Users {
    private String username;
    private String encryptedPassword;
    private String noTelp;
    private String name;
    private Date LPD;
        public String getEncryptedPassword() {
        return encryptedPassword;
    }
    public Users(String username, String encryptedPassword,String name,String noTelp,Date LPD)
    {
        this.username = username;
        this.encryptedPassword = encryptedPassword;
        this.noTelp = noTelp;
        this.name = name;
        this.LPD = LPD;
        }  
    
    
    
        public String getUsername() {
        return username;
    }

    public String getNoTelp(){
        return noTelp;
    }
    
    public String getName(){
        return name;
    }
    
    public Date getLPD(){
        return LPD;
    }
}
  