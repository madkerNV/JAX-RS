package org.example.eigennaam.domain;

public class Framework {
    int id;
    String naam;
    String logo;
    int score;

    public Framework(int id, String naam, String logo, int score) {
        this.id = id;
        this.naam = naam;
        this.logo = logo;
        this.score = score;
    }

    public Framework() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Framework{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", logo='" + logo + '\'' +
                ", score=" + score +
                '}';
    }
}
