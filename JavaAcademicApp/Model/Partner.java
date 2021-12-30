/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class Partner extends User{
  private String partnerId;
  private String name;
  private String companyName;
  private String address;
    public Partner(String username,String encryptedPassword,String noTelp,String name,String companyName,String address){
        super(username,encryptedPassword,noTelp,name);
        this.name= name;
        this.companyName = companyName;
        this.address=address;
    }

    public String getPartnerId(){
        return partnerId;
    }
public void setPartnerId(String partnerId){
    this.partnerId = partnerId;
}
        public String getName(){
        return name;
    }
public void setName(String name){
    this.name = name;
}
        public String getcompanyName(){
        return companyName;
    }
public void setCompanyName(String companyName){
    this.companyName = companyName;
    
}
        public String getAddress(){
        return address;
    }
public void setAddress(String address){
    this.address = address;
    
}

}
