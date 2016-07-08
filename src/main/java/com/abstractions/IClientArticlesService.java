package com.abstractions;

import com.model.ClientArticle;

import java.util.List;

public interface IClientArticlesService {
    List<ClientArticle> getClientArticles(String clientName);
}
