package com.implementations;

import code.com.olo.easydip.annotations.Implementation;
import com.model.Client;
import com.model.ClientOrder;

import java.util.ArrayList;
import java.util.List;

@Implementation
public class FakeClientsService {
    public ArrayList<Client> getFakeClients(){
        ArrayList<Client> clients = new ArrayList<Client>();

        clients.add(new Client("Mark", 18));
        clients.add(new Client("Andrew", 24));
        clients.add(new Client("Donald", 70));
        clients.add(new Client("Anthony", 26));
        clients.add(new Client("Gregory", 30));
        clients.add(new Client("Martin", 46));
        clients.add(new Client("Ann", 23));
        clients.add(new Client("Monica", 79));
        clients.add(new Client("Jennifer", 63));

        return clients;
    }

    public List<ClientOrder> getFakeClientOrders(){
        List<ClientOrder> orders = new ArrayList<ClientOrder>();

        orders.add(new ClientOrder("ORD/1/23123", 20.45));
        orders.add(new ClientOrder("ORD/1/23124", 874.11));
        orders.add(new ClientOrder("ORD/1/23125", 2230.36));
        orders.add(new ClientOrder("ORD/1/23126", 2096.74));
        orders.add(new ClientOrder("ORD/1/23127", 2530.49));

        return orders;
    }
}
