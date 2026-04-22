package stroganov.dmitriy.behavioral.memento;

import java.time.LocalDate;

public class Turist {

    private String place;

    private LocalDate date;

    public Turist(String place, LocalDate date) {
        this.place = place;
        this.date = date;
    }

    public Photo takePhoto(){
        return new Photo(place, date);
    }

    public void returnToLastLocation(Photo photo){
        place = photo.getPlace();
        date = photo.getDate();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Turist{" +
                "place='" + place + '\'' +
                ", date=" + date +
                '}';
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
