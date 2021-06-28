/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities.verification_codes;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import kodlama.io.entities.users.Candidate;

/**
 *
 * @author kaan
 */
@Entity
public class VerificationCodeCandidates extends VerificationCode {

    @OneToMany(mappedBy = "verificationCode")
    private List<Candidate> candidates;
}
