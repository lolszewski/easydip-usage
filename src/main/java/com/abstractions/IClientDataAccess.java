package com.abstractions;

import com.model.Client;

import java.util.List;

public interface IClientDataAccess {
    List<Client> getClients();
}
