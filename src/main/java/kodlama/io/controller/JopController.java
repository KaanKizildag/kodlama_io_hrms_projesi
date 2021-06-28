/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlama.io.controller;

import java.util.List;
import kodlama.io.service.abstracts.JopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kaan
 */
@RestController
@RequestMapping("/api/jops")
public class JopController {

    @Autowired
    private JopService jopService;

    @GetMapping("/getCategoryNames")
    List<String> getCategoryNames() {
        return jopService.getCategoryNames();
    }

}
