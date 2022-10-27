package htw.berlin.webtech.demo.user;

import javax.persistence.*;


@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "User_Name", nullable = false)
    private String username;

    @Column(name = "Passwort", nullable = false)
    private String passwort;

    @Column(name = "Weight", nullable = false)
    private int weight;

    @Column(name = "Height", nullable = false)
    private int height;

    @Column(name = "Age")
    private int age;

    @Column(name = "BMI", nullable = false)
    private double bmi;

    @Column(name = "Category")
    private String category;

    @Column(name = "Goal_Weight", nullable = false)
    private int goalW;
    @Column(name = "BMR", nullable = false)
    private int bmr;


    public UserEntity(String username, String passwort, int weight,int height, int age, double bmi,String category, int goalW, int bmr) {
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

    protected UserEntity(){

    }

    public long getId() {
        return id;
    }

    public int getBmr() {
        return bmr;
    }

    public void setBmr(int bmr) {
        this.bmr = bmr;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public void setCategory(String category) {
        this.category = category;
    }
}
