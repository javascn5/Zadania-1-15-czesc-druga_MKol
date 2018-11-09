package com.sda.Day13;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private LocalDate birthDate;

    UserParamsGenerator generator = new UserParamsGenerator();

    public User(String firstName, String lastName, String password, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = generator.generateLogin(firstName, lastName);
        this.password = password;
        this.birthDate = birthDate;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean czyPelnoletni() {
        LocalDate dataPotrzebnaDoPelnoletnosci = LocalDate.now().minusYears(18);

        if (birthDate.isBefore(dataPotrzebnaDoPelnoletnosci)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + "***********" + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
