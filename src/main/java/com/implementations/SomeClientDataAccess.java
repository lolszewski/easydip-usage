package com.implementations;

import code.com.olo.easydip.annotations.Implementation;
import com.abstractions.IClientDataAccess;
import com.model.Client;

import java.util.List;

@Implementation
public class SomeClientDataAccess implements IClientDataAccess {
    public List<Client> getClients() {
        return null;
    }
}
