/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaacademicapp;

import DAO.DBConnector;
import DAO.UserDAO;
import Model.Activity;
import Model.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author LEGION 5
 */

/*
Pada kelas main, lakukan aksi-aksi berikut secara berurut.
    1. Buat 5 buat user baru!
    2. Ubah username 2 user yang telah anda buat!
    3. Coba ubah username salah satu user dengan menggunakan username yang sama dengan username yang 
    ada!
    4. Coba ubah username 2 user yang lain dengan menggunakan username yang telah ada!
    5. Cetak seluruh activity yang telah ada!
    6. Cetak seluruh activity yang terjadi pada hari ini. 
    7. Lakukan login 2 kali dengan menggunakan user yang berbeda!
    8. Lakukan failed login 2 kali dengan menggunakan user yang berbeda!
    9. Cetak seluruh activity yang dilakukan oleh 2 user tertentu. 
    10. Cetak 10 activity terakhir.
*/

public class JavaUserManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DBConnector.initiateDB();
        
        User.userList1 = UserDAO.getAllUsers();
        
        
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "testPassword";
        String encryptedPassword = "";
        MessageDigest md;
        try {
            
            md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            encryptedPassword = DatatypeConverter.printHexBinary(digest).toUpperCase();
            
        } catch (NoSuchAlgorithmException ex) {
            
            Logger.getLogger(JavaUserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        


        User u1 = null;

        
        
        if (u1 != null)
        {
            u1.updateUsername("josta120");
        }
        
        System.out.println("TOTAL USER: " + User.userList1.size());
        (new halamanLogin()).setVisible(true);
         
    }
    
}
