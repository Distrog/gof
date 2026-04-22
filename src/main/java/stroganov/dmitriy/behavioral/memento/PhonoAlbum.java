package stroganov.dmitriy.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class PhonoAlbum {

    Deque<Photo> photos;

    public PhonoAlbum() {
        this.photos = new ArrayDeque<>();
    }

    public Deque<Photo> getPhotos() {
        return photos;
    }

    @Override
    public String toString() {
        return "PhonoAlbum{" +
                "photos=" + photos +
                '}';
    }
}
