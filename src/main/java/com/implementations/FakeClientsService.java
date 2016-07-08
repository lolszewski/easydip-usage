package com.implementations;

import code.com.olo.easydip.annotations.Implementation;
import com.model.Client;

import java.util.ArrayList;

@Implementation
public class FakeClientsService {
    public ArrayList<Client> GetFakeClients(){
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
}
