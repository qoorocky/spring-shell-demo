package com.example.demo.convert;

import com.example.demo.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToUserConverter implements Converter<String, User> {
    @Override
    public User convert(String s) {
        User user =new User();
        String[] temp = s.split(",");
        if(temp.length == 2){
            user.setName(temp[0]);
            user.setGender(temp[1]);
        }
        return user;
    }
}
