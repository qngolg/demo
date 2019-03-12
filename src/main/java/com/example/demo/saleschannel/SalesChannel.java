package com.example.demo.saleschannel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesChannel {


    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
