/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.service.abstracts;

import java.util.List;
import kodlama.io.entities.users.User;

/**
 *
 * @author kaan
 */
public interface UserService {

    List<User> getAll();
}
