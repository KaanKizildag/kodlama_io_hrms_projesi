/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities.users;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import kodlama.io.entities.verification_codes.VerificationCodeEmployers;
import lombok.Data;

/**
 *
 * @author kaan
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Employer extends User {

    private String companyName;

    private int numberOfEmployees;

    @ManyToOne
    private VerificationCodeEmployers verificationCode;
}
