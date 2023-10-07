package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entidades.Base;
import com.example.demo.Entidades.Persona;
import com.example.demo.Service.BaseServiceImpl;

import java.io.Serializable;
public abstract class BaseControllerImpl <E extends Base, S extends BaseServiceImpl<E, Long> > implements BaseController<E, Long> {

    protected S servicio;

    public BaseControllerImpl(S servicio) {
        this.servicio = servicio;
    }

    public BaseControllerImpl() {
    }

    @GetMapping({""})
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.findAll());
        } catch (Exception var2) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde\"}");
        }
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<?> getID(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.findById(id));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde\"}");
        }
    }

    @PostMapping({""})
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.save(entity));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde\"}");
        }
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.servicio.update(id, entity));
        } catch (Exception var4) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde\"}");
        }
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.servicio.delete(id));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde\"}");
        }
    }
}

