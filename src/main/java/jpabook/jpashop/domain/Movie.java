package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Movie extends Item {
    private String directer;
    private String actor;

    public String getDirecter() {
        return directer;
    }

    public void setDirecter(String directer) {
        this.directer = directer;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
