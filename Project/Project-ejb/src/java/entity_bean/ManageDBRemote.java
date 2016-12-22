/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity_bean;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author scorp
 */
public interface ManageDBRemote {
    
   public void addUser(User user);    

   public List<User> getUsers();
}
