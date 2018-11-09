package com.sda.Day13;

import java.util.HashMap;

public class UserService {
    private HashMap<Integer, User> userservice = new HashMap<>();    //Klucz Integer, Obiekt mapy User, pojemnosc domyslna 20, wspolczynnik wypelnienia 0.8
    private HashMap<Integer, User> temp = new HashMap<>();
    Methods metody = new Methods();

    public void add(User user) {
        int key = userservice.size();
        for(int i = 0; i < userservice.size(); i++){
            if (userservice.get(i).getLogin().equals(user.getLogin()) || !user.czyPelnoletni() || !metody.czyWszystkiePolaWypelnione(user)) {
                return;
            }
        }

        userservice.put(key, user);
    }

    public void update(String login, User user) {
        for (int i = 0; i < userservice.size(); i++) {
            if (login.equals(userservice.get(i).getLogin())) {
                userservice.remove(i);
                userservice.put(i, user);
                return;
            }
        }
    }

    public void remove(String login) {
        int newSize = 0;
        for (int i = 0; i < userservice.size(); i++) {
            if (login.equals(userservice.get(i).getLogin())) {
                userservice.remove(i);
                for (int j = 0; j < userservice.size()+1; j++) {
                    if(userservice.containsKey(j)){
                        temp.put(newSize, userservice.get(j));
                        newSize++;
                    }
                }
                userservice = temp;
                temp = null;
                return;
            }
        }
    }

    public void show(){
        for(int i = 0; i < userservice.size(); i++){
            System.out.println(userservice.get(i).toString());
//            System.out.println(i + ".\tImie: " + userservice.get(i).getFirstName() + "\tNazwisko: " + userservice.get(i).getLastName() + "\tLogin: " + userservice.get(i).getLogin() +
//                    "\tHasło: " + userservice.get(i).getPassword() + "\tData ur.: " + userservice.get(i).getBirthDate());
        }
    }

    public boolean login(String login, String haslo){
        for(int i = 0; i < userservice.size(); i++){
            if(userservice.get(i).getLogin().equals(login) && userservice.get(i).getPassword().equals(haslo)){
                return true;
            }
        }
        return false;
    }

    public void search(String nazwa){
        for(int i = 0; i < userservice.size(); i++){
            if(userservice.get(i).getFirstName().equals(nazwa) || userservice.get(i).getLastName().equals(nazwa)){
                System.out.println(userservice.get(i).toString());
            }
        }
    }

}
