package entity;

import java.util.Date;

/**
 * Report parent class
 */
public abstract class Report {
    private static final String STUB = "STUB";

    /** report author */
    private String author;
    /** date of creation */
    private Date creationDate;
    /** name */
    private String name;

    Report(String author, String name) {
        this.author = author;
        this.name = name;
        this.creationDate = new Date();
    }

    /**
     * extends log output
     */
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Создан объект " + getName() + " пользователь: " + this.getAuthor();
    }
}
