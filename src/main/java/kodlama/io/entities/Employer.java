/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities;

import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author kaan
 */
@Entity
@Data
public class Employer extends User{
    private String companyName;
    private int numberOfEmployees;
}
