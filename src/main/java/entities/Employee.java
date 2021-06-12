/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author kaan
 */
@Entity
@Data
public class Employee extends User{
   private String name;
   private String surname;
   private String IdentityNumber;
   
}
