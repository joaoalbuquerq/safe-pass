package com.jp.safe_pass.validation;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

@Component("ValidationSpecialCharacter")
public class ValidateSpecialCharacter implements ValidateParameterPassword{
    @Override
    public void validar(String pass, List<String> failures) {
        if(!Pattern.matches(".*[\\W].*", pass)){
            failures.add("A senha deve possuir pelo menos um caracter especial (@,!,%,$,#...)");
        }
    }
}
