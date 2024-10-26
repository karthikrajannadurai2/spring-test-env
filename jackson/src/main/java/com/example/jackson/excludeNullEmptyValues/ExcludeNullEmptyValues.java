package com.example.jackson.excludeNullEmptyValues;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcludeNullEmptyValues {

    @PostMapping
    public Customer getCustomer(@RequestBody Customer customer) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();
        System.out.println(customer.getName());
        System.out.println(objectMapper.writeValueAsString(customer));
        return customer;
    }

    @PostMapping("/testJson")
    public String getCustomerJson(@RequestBody JsonNode json) {
        Customer c = new Customer();
        c.setId(23);
        Aadhaar d = new Aadhaar();
        d.setAadhaarNo("0965423456789");
        c.setAadhaar(d);
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl();
        beanWrapper.setBeanInstance(c);
//        System.out.println(beanWrapper.getPropertyValue("id"));
//        System.out.println(beanWrapper.getPropertyValue("aadhaar.aadhaarNo"));
//        System.out.println(beanWrapper.getPropertyDescriptor("aadhaar.aadhaarNo"));
//        System.out.println(json.at("/names"));
        JSONObject r = new JSONObject();
        BeanUtils.copyProperties(c, JsonNode.class);
//        beanWrapper.convertForProperty("", "aadhaar.aadhaarNo");
        return "";
    }
}
