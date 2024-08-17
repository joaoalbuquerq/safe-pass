package com.jp.safe_pass.service;

import com.jp.safe_pass.validation.ValidateParameterPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    @Autowired
    private List<ValidateParameterPassword> validations;

    public List<String> validatePas(String pass){
        List<String> failures = new ArrayList<>();
        validations.forEach(v -> v.validar(pass, failures));
        return failures;
    }


}
