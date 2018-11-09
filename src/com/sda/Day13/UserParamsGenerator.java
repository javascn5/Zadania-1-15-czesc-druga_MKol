package com.sda.Day13;

import java.util.Random;

public class UserParamsGenerator {

    public String generateLogin(String imie, String nazwisko) {
        String login = imie.substring(0, 1).concat(nazwisko).toLowerCase();
        return login;
    }

    public String generatePassword() {
        Random random = new Random();
        String password = "";

        for(int i = 0; i < 8; i++){
            password = password.concat(String.valueOf(random.nextInt(10)));
        }

        return password;
    }
}
