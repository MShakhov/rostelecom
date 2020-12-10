package com.shakhovmv.rostelecom.utils;


import com.shakhovmv.rostelecom.model.User;

public class UserConverter {

    public static String toCsv(User user){
        if(null == user)
            return null;
        return String.format("%s;%s;%d;%s%n",user.getName(), user.getSurname(), user.getAge(), user.getSex());
    }
}
