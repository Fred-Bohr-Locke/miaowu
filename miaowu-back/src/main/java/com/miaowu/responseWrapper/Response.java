package com.miaowu.responseWrapper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private Integer code;
    private String message;
    private Object data;

    public Response() {
        this.code = 200;
        this.message = "Success";
    }

    public Response(Object data) {
        this.code = 200;
        this.message = "Success";
        this.data = data;
    }

    public Response(String message, Object data) {
        this.code = 200;
        this.message = message;
        this.data = data;
    }

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
