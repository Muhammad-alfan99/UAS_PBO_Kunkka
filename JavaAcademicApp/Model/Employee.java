/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.User;

/**
 *
 * @author LEGION 5
 */
public class Employee extends User {
    private String name;
    private int division;
    private String employeeId;
    private String username;
    private String encryptedPassword;
    private String noTelp;
    public Employee (String username, String encryptedPassword,String noTelp,String name,int division)
    {
        super (username, encryptedPassword, noTelp,name);
        this.username = username;
        this.encryptedPassword = encryptedPassword;
        this.noTelp = noTelp;
        this.name=name;
        this.division = division;
    }
    


    /**
     * @return the employeeId
     */

    /**
     * @param employeeId the employeeId to set
     */
        public String getEncryptedPassword() {
        return encryptedPassword;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public int getDivision(){
        return division;
    }
    
            public String getUsername() {
        return username;
    }

    public String getNoTelp(){
        return noTelp;
    }
    
}
