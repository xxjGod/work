package com.xxjsmile.zookeeper.client;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class MyConfig {
    private String key;
    private String name;

    public static void main(String[] args) throws JsonProcessingException {
        MyConfig myConfig = new MyConfig();
        myConfig.setKey("123");
        myConfig.setName("xxj");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(myConfig);
        System.out.println(s);
    }
}
