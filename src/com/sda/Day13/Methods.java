package com.sda.Day13;

public class Methods {

    public boolean czyWszystkiePolaWypelnione(User user){
        if (user.getFirstName() == null || user.getLastName() == null || user.getLogin() == null || user.getPassword() == null || user.getBirthDate() == null){
            return false;
        }
        return true;
    }

    public boolean czyHasloMa8Znakow(User user){
        if(user.getPassword().length() > 7){
            return true;
        }

        return false;
    }
}
