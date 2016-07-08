package com.olo;

import code.com.olo.easydip.core.InjectionsManager;
import com.abstractions.IClientArticlesService;
import com.abstractions.IClientDataAccess;
import com.abstractions.IClientOrdersService;
import com.implementations.ClientsService;
import com.implementations.DataAccess;
import com.model.Client;

import java.util.List;

public class App {
    public static void main( String[] args ) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        InjectionsManager.instance.initialize();

        showClients("mssql");
        showClients("oracle");
        showClients("elastic");

        DataAccess dataAccess = InjectionsManager.instance.get(DataAccess.class);
        printClients(dataAccess.msSql.getClients(), "mssql");
        printClients(dataAccess.oracle.getClients(), "oracle");
        printClients(dataAccess.elastic.getClients(), "elastic");

        IClientArticlesService clientArticlesService = InjectionsManager.instance.get(IClientArticlesService.class);
        IClientOrdersService clientOrdersService = InjectionsManager.instance.get(IClientOrdersService.class);
        ClientsService clientsService = InjectionsManager.instance.get(ClientsService.class);

        ((IClientArticlesService)clientsService).getClientArticles("Martin");
        ((IClientOrdersService)clientsService).getClientOrders("Martin");
    }

    private static void showClients(String source){
        List<Client> clients = InjectionsManager.instance.get(IClientDataAccess.class, source).getClients();
        printClients(clients, source);
    }

    private static void printClients(List<Client> clients, String source){
        System.out.println(String.format("Clients from %1$s (count:%2$d)", source, clients.toArray().length));
        for (Client client: clients){
            System.out.println(String.format("Name: %1$s, Age: %2$d", client.Name, client.Age));
        }
        System.out.println("--------------------------");
    }
}
