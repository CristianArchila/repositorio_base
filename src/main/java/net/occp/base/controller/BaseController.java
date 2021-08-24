package net.occp.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maurizio
 */
@RestController
public class BaseController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "hello")
    public ResponseEntity<HttpStatus> hello() {
        log.info("Prueba de conectividad");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
