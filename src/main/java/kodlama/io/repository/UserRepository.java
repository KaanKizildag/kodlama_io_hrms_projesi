/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.repository;

import kodlama.io.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kaan
 */

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
