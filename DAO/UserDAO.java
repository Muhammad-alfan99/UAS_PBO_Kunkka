/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LEGION 5
 */
public class UserDAO {
    public static ArrayList<User> getAllUsers()
    {
        ArrayList<User> userList = new ArrayList<User>();
        
        Statement statement;
        try {
            statement = DBConnector.conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from USER");
            
            while (resultSet.next())
            {
                User newUser = new User(resultSet.getString("username"), resultSet.getString("encrypted_password"), resultSet.getString("notelp"),resultSet.getString("name"));
                
                userList.add(newUser);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }
    
    public static void addUser(User newUser)
    {
        PreparedStatement ps;
        try {
            
            String sql = "insert into USER (username, encrypted_password,notelp,name) values (?, ?,?,?)";
            ps = DBConnector.conn.prepareStatement(sql);
            ps.setString(1, newUser.getUsername());
            ps.setString(2, newUser.getEncryptedPassword());
            ps.setString(3, newUser.getNoTelp());         
            ps.setString(4, newUser.getName());  
            ps.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
}
