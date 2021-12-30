/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.ZonedDateTime;

/**
 *
 * @author LEGION 5
 */
public class Customer extends User {
    private String idNumber;
    private  String name;
    private ZonedDateTime lastPurchasedDate;
    public Customer(String username, String encryptedPassword,String noTelp,String name,ZonedDateTime lastPurchasedDate)
    {
        super(username, encryptedPassword,noTelp,name);
        this.lastPurchasedDate = lastPurchasedDate;
    }
    
    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
     public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
         public ZonedDateTime getLastPurchasedDate(){
        return lastPurchasedDate;
    }
    public void setLasPurchasedDate(ZonedDateTime lastPurchasedDate){
        this.lastPurchasedDate=lastPurchasedDate    ;
    }
    
    
}
