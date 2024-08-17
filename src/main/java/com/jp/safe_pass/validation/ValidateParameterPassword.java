package com.jp.safe_pass.validation;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ValidateParameterPassword {
    void validar(String pass, List<String> failures);
}
