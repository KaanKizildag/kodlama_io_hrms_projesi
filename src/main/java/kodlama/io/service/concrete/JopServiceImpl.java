/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.service.concrete;

import java.util.List;
import kodlama.io.repository.JopRepository;
import kodlama.io.service.abstracts.JopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kaan
 */
@Service
public class JopServiceImpl implements JopService {

    private JopRepository jopRepository;

    @Autowired
    public JopServiceImpl(JopRepository jopRepository) {
        this.jopRepository = jopRepository;
    }

    @Override
    public List<String> getCategoryNames() {
        return jopRepository.getCategoryNames();
    }

}
