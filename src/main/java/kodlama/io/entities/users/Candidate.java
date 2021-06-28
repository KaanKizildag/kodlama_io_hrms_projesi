/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities.users;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import kodlama.io.entities.verification_codes.VerificationCodeCandidates;

/**
 *
 * @author kaan
 */
@Entity
public class Candidate extends User{
    
    
    @ManyToOne
    private VerificationCodeCandidates verificationCode;
}
