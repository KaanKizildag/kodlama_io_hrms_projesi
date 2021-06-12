/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.service.concrete;

import kodlama.io.entities.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import kodlama.io.repository.UserRepository;
import kodlama.io.service.abstracts.UserService;
import org.springframework.stereotype.Service;

/**
 *
 * @author kaan
 */
@Service
public class UserServiceImpl implements UserService{

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
