package com.jp.safe_pass.validation;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("ValidationLength")
public class ValidateLenth implements ValidateParameterPassword{

    @Override
    public void validar(String pass, List<String> failures) {
        if(pass != null && pass.length() < 8){
            failures.add("A senha deve possuir pelo menos 8 caracteres");
        }
    }
}
