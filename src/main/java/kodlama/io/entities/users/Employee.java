/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author kaan
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Employee extends User {

    @Column(name = "name")
    private String name;
    
    @Column(name = "username")
    private String surname;
    
    @Column(name = "identityNumber")
    private String identityNumber;
}
