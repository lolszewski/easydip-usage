package com.implementations;

import code.com.olo.easydip.annotations.AutoInject;
import code.com.olo.easydip.annotations.Implementation;
import com.abstractions.IClientDataAccess;
import com.model.Client;

import java.util.List;

@Implementation(implementationName = "oracle")
@AutoInject
public class OracleClientDataAccess implements IClientDataAccess {
    FakeClientsService fakeClientsService;

    public List<Client> getClients() {

        return fakeClientsService.getFakeClients().subList(0, 2);
    }
}
