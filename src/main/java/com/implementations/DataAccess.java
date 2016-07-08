package com.implementations;

import code.com.olo.easydip.annotations.AutoInject;
import code.com.olo.easydip.annotations.Implementation;
import com.abstractions.IClientDataAccess;

@Implementation
@AutoInject
public class DataAccess {
    @AutoInject(implementationName = "mssql")
    public IClientDataAccess msSql;

    @AutoInject(implementationName = "oracle")
    public IClientDataAccess oracle;

    @AutoInject(implementationName = "elastic")
    public IClientDataAccess elastic;
}
