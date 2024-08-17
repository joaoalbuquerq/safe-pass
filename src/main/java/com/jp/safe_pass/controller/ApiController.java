package com.jp.safe_pass.controller;

import com.jp.safe_pass.dto.BodyRequestDTO;
import com.jp.safe_pass.dto.FailureResponseDTO;
import com.jp.safe_pass.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    PasswordService service;

    @PostMapping("/validate-password")
    public ResponseEntity<?> validatePassword(@RequestBody BodyRequestDTO dto){

        var failures = service.validatePas(dto.password());

        if(failures.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.badRequest().body(new FailureResponseDTO(failures));
    }

}
