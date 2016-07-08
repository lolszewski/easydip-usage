package com.abstractions;

import com.model.ClientOrder;

import java.util.List;

public interface IClientOrdersService {
    List<ClientOrder> getClientOrders(String clientName);
}
