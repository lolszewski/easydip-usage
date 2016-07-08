package com.implementations;

import code.com.olo.easydip.annotations.Implementation;
import com.abstractions.IClientArticlesService;
import com.abstractions.IClientOrdersService;
import com.model.ClientArticle;
import com.model.ClientOrder;

import java.util.List;

@Implementation
public class ClientsService implements IClientOrdersService, IClientArticlesService {
    public List<ClientOrder> getClientOrders(String clientName) {
        return null;
    }

    public List<ClientArticle> getClientArticles(String clientName) {
        return null;
    }
}
