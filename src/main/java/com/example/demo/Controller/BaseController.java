package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Entidades.Base;

import java.io.Serializable;
public interface BaseController <E extends Base, ID extends Serializable> {

    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getID(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable ID id);

}
