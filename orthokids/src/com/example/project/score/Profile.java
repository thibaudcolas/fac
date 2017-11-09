package com.example.project.score;

public class Profile {

    private Long id;
    /** Not-null value. */
    private String name;
    private java.util.Date age;
    private int mail;

    public Profile() {
    }

    public Profile(Long id) {
        this.id = id;
    }

    public Profile(Long id, String name, java.util.Date age, int mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getAge() {
        return age;
    }

    public void setAge(java.util.Date age) {
        this.age = age;
    }

    public int getMail() {
        return mail;
    }

    public void setMail(int mail) {
        this.mail = mail;
    }

}
