package stroganov.dmitriy.behavioral.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Blogger {

    private List<Subscriber> subscriberList;

    public Blogger(Subscriber... subscribers){
        subscriberList = Arrays.asList(subscribers);
    }

    public Blogger() {
        this.subscriberList = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers(){
        subscriberList.forEach(s->s.say());
    }
}
