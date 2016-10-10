package br.mack.exception;

import java.util.Map;

/**
 * Created by cmaia on 10/10/16
 */
public class ValidationException extends RuntimeException {

    private Map<String, String> validationErrors;

    public ValidationException(Map<String, String> errors) {
        super();
        this.validationErrors = errors;
    }

    public Map<String, String> getValidationErrors() {
        return validationErrors;
    }
}
