package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entidades.Autor;
import com.example.demo.Service.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "APISP/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

    public AutorController() {
    }

}
