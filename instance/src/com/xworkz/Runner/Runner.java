package com.xworkz.Runner;

import com.xworkz.external.OracleJDBC;
import com.xworkz.external.mysql;
import com.xworkz.internal.IplApp;
import com.xworkz.internal.JDBC;


public class Runner {
    public static void main(String[] args) {
        JDBC jdbc=new OracleJDBC();
        JDBC jdbc1=new mysql();
        IplApp iplApp1=new IplApp(jdbc1);
        iplApp1.saveDetails();

        IplApp iplApp=new IplApp(jdbc);
        iplApp.saveDetails();











    }
}

