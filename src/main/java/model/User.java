package model;

public class User {
    private int id;
    private String pib;
    private int course;

    public User(int id, String pib, int course) {
        this.id = id;
        this.pib = pib;
        this.course = course;
    }


    public User(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
    public String getPib() {
        return pib;
    }

    public int getId() {
        return id;
    }
}