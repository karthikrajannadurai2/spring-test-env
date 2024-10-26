package com.example.jackson.excludeNullEmptyValues;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Customer {

    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private Aadhaar aadhaar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Aadhaar> getAadhaar() {
        return Optional.ofNullable(aadhaar);
    }

    public void setAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }
}
