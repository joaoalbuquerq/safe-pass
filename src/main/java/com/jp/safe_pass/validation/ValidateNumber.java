package com.jp.safe_pass.validation;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

@Component("ValidationNumber")
public class ValidateNumber implements ValidateParameterPassword{
    @Override
    public void validar(String pass, List<String> failures) {
        if(!Pattern.matches(".*[0-9].*", pass)){
            failures.add("A senha deve possuir pelo menos uma letra maiússcula");
        }
    }
}
