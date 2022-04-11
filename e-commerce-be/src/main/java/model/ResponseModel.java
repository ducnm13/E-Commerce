package model;

import java.util.Map;

public class ResponseModel {

    private int code;
    private String message;
    private Map<String, Object> response;

    public ResponseModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseModel(int code, String message, Map<String, Object> response) {
        this.code = code;
        this.message = message;
        this.response = response;
    }
}
