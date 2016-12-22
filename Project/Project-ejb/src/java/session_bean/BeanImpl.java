/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;

import entity_bean.ManageDB;
import entity_bean.ManageDBRemote;
import entity_bean.User;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
public class BeanImpl implements Bean {
    
    Properties props;  
    InitialContext ctx;
    private BufferedReader brConsoleReader;
   {
      props = new Properties();
      try {
         props.load(new FileInputStream("jndi.properties"));
      } catch (IOException ex) {
         ex.printStackTrace();
      }
      try {
         ctx = new InitialContext(props);            
      } catch (NamingException ex) {
         ex.printStackTrace();
      }
      brConsoleReader = 
      new BufferedReader(new InputStreamReader(System.in));
   }
   
   public static void main(String[] args) {

      BeanImpl ejbTester = new BeanImpl();

      ejbTester.connection();
   }
    
    
    /**
     * Method to validate the authentification of user
     * @return boolean
     */
    public Boolean connection(){
        try {
            ManageDBRemote libraryBean = (ManageDBRemote) ctx.lookup("ManageDBRemote/remote");
            List<User> users = libraryBean.getUsers();
            for(User user : users) System.out.println(user.getFirstName()+" "+user.getLastName());
        } catch (NamingException ex) {
            Logger.getLogger(BeanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return true;
    }
    
    /**
     * Method to get all data associated to the user
     * @return Map object with all results
     */
    public Map<String, Set<String>> retrieveAllData(){
        return null;
    }
    
    /**
     * Method to modify a tuple associated to the user in the database with a key key
     * and a value value.
     * @param key
     * @param value 
     */
    public void update(String key, String value){
        
    }
    
    /**
     * Method to suppress a tuple associated to the user in the database with
     * a key key and a value value.
     * @param key
     * @param value 
     */
    public void suppress(String key, String value){
        
    }
    
    /**
     * Method to add a new tuple asssociated to the user in the database with 
     * a key key and a value value.
     * @param key
     * @param value 
     */
    public void add(String key, String value){
        
    }
}
