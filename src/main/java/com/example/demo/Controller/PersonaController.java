package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entidades.Persona;
import com.example.demo.Service.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="APISP/persona" )
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    public PersonaController() {
    }


}
