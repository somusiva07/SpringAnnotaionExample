package learn.spring.annotation.sample.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import learn.spring.annotation.sample.drivers.DatabaseDriver;

@Service
public class DBService {

    @Autowired
    @Qualifier("oracleDriver")
    private DatabaseDriver databaseDriver;

    public String getDriverInfo(){
        return databaseDriver.getDriverInfo();
    }
}


