/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities.verification_codes;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import kodlama.io.entities.users.Employer;
import lombok.Data;

/**
 *
 * @author kaan
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class VerificationCodeEmployers extends VerificationCode {

    @OneToMany(mappedBy = "verificationCode")
    private List<Employer> employers;
}
