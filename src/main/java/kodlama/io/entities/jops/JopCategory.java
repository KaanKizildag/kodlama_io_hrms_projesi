/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.entities.jops;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author kaan
 */
@Entity
@Data
public class JopCategory {

    @Id
    private int id;

    @Column
    private String categoryName;
    
    @OneToMany(mappedBy = "jopCategory")
    private List<Jop> jops;
}
