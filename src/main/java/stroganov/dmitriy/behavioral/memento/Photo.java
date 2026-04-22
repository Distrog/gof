package stroganov.dmitriy.behavioral.memento;

import java.time.LocalDate;

public class Photo {

    private String place;
    private LocalDate date;

    public Photo(String place, LocalDate date) {
        this.place = place;
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "place='" + place + '\'' +
                ", date=" + date +
                '}';
    }
}
