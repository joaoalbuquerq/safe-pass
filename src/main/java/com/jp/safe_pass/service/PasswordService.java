package com.jp.safe_pass.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasswordService {

    public List<String> validatePas(String pass){
        List<String> failures = new ArrayList<>();

        validateLength(pass, failures);

        return failures;
    }

    private void validateLength(String pass, List<String> failures) {
        if(pass != null && pass.length() < 8){
            failures.add("A senha deve possuir pelo menos 8 caracteres");
        }
    }

}
