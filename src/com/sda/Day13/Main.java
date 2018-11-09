package com.sda.Day13;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    User uzytkownik1 = new User("Antek", "Parowka", "qwerty123", LocalDate.of(2005, 02, 20));
	    User uzytkownik2 = new User("Helena", "Zuczek");
	    Methods metoda = new Methods();
//todo Zad. 1
        System.out.println("Czy wszystkie pola zostaly wypelnione?: " + metoda.czyWszystkiePolaWypelnione(uzytkownik1));
        System.out.println("Czy wszystkie pola zostaly wypelnione?: " + metoda.czyWszystkiePolaWypelnione(uzytkownik2));
//todo Zad. 2
        System.out.println("Czy haslo ma conajmniej 8 znakow?: " + metoda.czyHasloMa8Znakow(uzytkownik1));
//todo Zad. 3
//        UserParamsGenerator generator = new UserParamsGenerator();
//        uzytkownik1.setLogin(generator.generateLogin(uzytkownik1.getFirstName(), uzytkownik1.getLastName()));
//        uzytkownik1.setPassword(generator.generatePassword());
//        System.out.println("Nowy login uzytkownik1: " + uzytkownik1.getLogin());
//        System.out.println("Nowe haslo: " + uzytkownik1.getPassword());
//todo Zad. 4
//        System.out.println("Czy uzytkownik jest pelnoletni?: " + uzytkownik1.czyPelnoletni());
//todo Zad. 5, 6, 7, 8, 9
        UserService service = new UserService();



        User uzytkownik3 = new User("Michal", "Kasztan", "poiuytrewq", LocalDate.of(1970, 10, 15));
        User uzytkownik4 = new User("Ala", "Katan", "qazxcdewsx", LocalDate.of(1935, 10, 15));

        service.add(uzytkownik1);
        service.add(uzytkownik3);
        service.add(uzytkownik4);

        System.out.println("Added:");
        service.show();

        User uzytkownik5 = new User("Sakura", "Mitsuki", "Ichigo", LocalDate.of(1995, 03, 07));

//todo Zad. 10
        System.out.println("\nUpdated:");
        service.update("akatan", uzytkownik5);

        service.show();

//todo Zad. 11
        System.out.println("\nRemoved:");
        service.remove("mkasztan");

        service.show();

//todo Zad. 12
        System.out.println("Czy login i haslo pasuja:");
        System.out.println("TAK: " + service.login("smitsuki", "Ichigo"));
        System.out.println("NIE: " + service.login("gamon", "tamala"));

//todo Zad. 13
        //Tutaj metoda getAll została zaimplementowana wczesniej jako metoda o nazwie "show()"

//todo Zad. 14, 15
        System.out.println("Szukanie po imieniu lub nazwisku:");
        System.out.println("TAK:");
        service.search("Sakura");
        System.out.println("NIE:");
        service.search("Mikasa");

    }
}
