/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.repository;

import java.util.List;
import kodlama.io.entities.jops.Jop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author kaan
 */
public interface JopRepository extends JpaRepository<Jop, Integer> {
    @Query("select jc.categoryName from JopCategory jc")
    List<String> getCategoryNames();
}
