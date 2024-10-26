package com.example.jackson.excludeNullEmptyValues;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Aadhaar {
    @JsonProperty
    private String aadhaarNo;

    @JsonProperty
    private String aadhaarName;

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        System.out.println("SETTING");
        this.aadhaarNo = aadhaarNo;
    }

    public String getAadhaarName() {
        return aadhaarName;
    }

    public void setAadhaarName(String aadhaarName) {
        this.aadhaarName = aadhaarName;
    }
}
