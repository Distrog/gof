package stroganov.dmitriy.behavioral.command;

public class TV {

    private boolean isOn = false;
    private Integer currentChannel;

    public void on() {
        if (isOn) {
            System.out.println("Ничего не происходит");
        } else {
            isOn = true;
            currentChannel = 1;
            System.out.println("Телевизор включен. Показывает 1ый канал.");
        }
    }

    public void off() {
        if (isOn) {
            isOn = false;
            currentChannel = null;
            System.out.println("Телевизор выключен");
        } else {
            System.out.println("Ничего не происходит");
        }
    }

    public void nextChannel() {
        if (!isOn) {
            on();
        } else {
            currentChannel++;
            System.out.printf("Телевизор переключен на %d канал\n", currentChannel);
        }
    }

    public void previousChannel() {
        if (!isOn) {
            on();
        } else if (currentChannel == 1) {
            System.out.println("Ничего не происходит");
        } else {
            currentChannel--;
            System.out.printf("Телевизор переключен на %d канал\n", currentChannel);
        }
    }
}
