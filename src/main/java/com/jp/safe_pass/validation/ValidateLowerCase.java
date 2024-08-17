package com.jp.safe_pass.validation;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

@Component("ValidationLowerCase")
public class ValidateLowerCase implements ValidateParameterPassword{
    @Override
    public void validar(String pass, List<String> failures) {
        if(!Pattern.matches(".*[a-z].*", pass)){
            failures.add("A senha deve possuir pelo menos uma letra minuscula");
        }
    }
}
