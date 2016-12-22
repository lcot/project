/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;

import java.util.Map;
import java.util.Set;
import javax.ejb.Stateless;

@Stateless
public class BeanImpl implements Bean {
      
    /**
     * Method to validate the authentification of user
     * @return boolean
     */
    public Boolean connection(){
        
    }
    
    /**
     * Method to get all data associated to the user
     * @return Map object with all results
     */
    public Map<String, Set<String>> retrieveAllData(){
        
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
