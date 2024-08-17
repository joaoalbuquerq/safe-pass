package com.jp.safe_pass.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    public List<String> validatePas(String pass){
        List<String> failures = new ArrayList<>();

        validateLength(pass, failures);
        validateUpperCase(pass,failures);
        validateLowerCase(pass,failures);

        return failures;
    }

    private void validateLength(String pass, List<String> failures) {
        if(pass != null && pass.length() < 8){
            failures.add("A senha deve possuir pelo menos 8 caracteres");
        }
    }

    private void validateUpperCase(String pass, List<String> failures){
        if(!Pattern.matches(".*[A-Z].*", pass)){
            failures.add("A senha deve possuir pelo menos uma letra maiússcula");
        }
    }

    private void validateLowerCase(String pass, List<String> failures){
        if(!Pattern.matches(".*[a-z].*", pass)){
            failures.add("A senha deve possuir pelo menos uma letra minuscula");
        }
    }

}
