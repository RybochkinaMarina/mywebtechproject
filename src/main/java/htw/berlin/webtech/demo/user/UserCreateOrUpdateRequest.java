package htw.berlin.webtech.demo.user;

import javax.persistence.Column;

public class UserCreateOrUpdateRequest {



    private String username;
    private String passwort;
    private int weight;
    private int height;
    private int age;
    private double bmi;
    private String category;
    private int goalW;
    private int bmr;


    public UserCreateOrUpdateRequest(String username, String passwort, int weight, int height, int age, double bmi, String category, int goalW
    , int bmr) {
        this.username = username;
        this.passwort = passwort;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.bmi = bmi;
        this.category = category;
        this.goalW = goalW;
        this.bmr = bmr;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int getGoalW() {
        return goalW;
    }

    public void setGoalW(int goalW) {
        this.goalW = goalW;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getCategory() {
        return category;
    }

    public int getBmr() {
        return bmr;
    }

    public void setBmr(int bmr) {
        this.bmr = bmr;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
