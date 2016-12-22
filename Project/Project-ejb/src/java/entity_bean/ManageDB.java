/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity_bean;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author scorp
 */
@Stateless
public class ManageDB implements ManageDBRemote{

    //pass persistence unit to entityManager.
   @PersistenceContext(unitName="EjbComponentPU")
   private EntityManager entityManager;         

   public void addUser(User user) {
      entityManager.persist(user);
   }    

   public List<User> getUsers() {        
      return entityManager.createQuery("From Users").getResultList();
   }
}
