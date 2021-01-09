package com.github.commandercool.ws.workshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.commandercool.ws.workshop.model.MasterRegisterForm;

@Controller
public class MasterRegisterController {

    @RequestMapping(value = "/master/register", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity register(@RequestBody MasterRegisterForm form) {
        return ResponseEntity.ok().build();
    }

}
