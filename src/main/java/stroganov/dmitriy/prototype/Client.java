package stroganov.dmitriy.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    private String name;
    private String phone;
    private List<Purchase> purchases;

    public Client(String name, String phone, List<Purchase> purchases) {
        this.name = name;
        this.phone = phone;
        this.purchases = purchases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Purchase> getPurchases() {
        return Collections.unmodifiableList(purchases);
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    Client createAndCopy(Client client) {
        List<Purchase> purchaseList = new ArrayList<>();

        client.getPurchases().forEach(p -> purchaseList.add(p));

        return new Client(client.getName(), client.getPhone(), purchaseList);
    }
}
