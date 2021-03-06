/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity_bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author scorp
 */
@Entity
@Table(name="pairs")
public class Attribute implements Serializable {

       @Id
   @Column(name="key")
   private int key;
       @Column(name="value")
   private String value;

   public Attribute(){        
   }

   //mark id as primary key with autogenerated value
   //map database column id with id field

   public int getKey() {
      return key;
   }
   
   public String getValue(){
       return value;
   }
   
   public void setKey(int key){
       this.key=key;
   }
   
   public void setValue(String value){
       this.value=value;
   }
    
}
