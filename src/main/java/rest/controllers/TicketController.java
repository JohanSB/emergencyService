package rest.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.resource.Ticket;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Ticket ticket){
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Ticket response (){
        return new Ticket(1L, "Test");
    }
}
