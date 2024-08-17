package com.jp.safe_pass.validation;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

@Component("ValidateSequencialNumbers")
public class ValidateSequencialNumbers implements ValidateParameterPassword{
    @Override
    public void validar(String pass, List<String> failures) {

        String sequentialPattern =  "(012|123|234|345|456|567|678|789|890|987|876|765|654|543|432|321|210)";

        if(pass.matches(".*" + sequentialPattern + ".*")){
            failures.add("A senha não pode possuir numeros sequenciais");
        }
    }
}
