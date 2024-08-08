package br.com.devbean.controllers;

import br.com.devbean.messaging.QueuesProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    private final QueuesProperties properties;

    public OrderController(QueuesProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(properties.getDlqs());
    }

}
