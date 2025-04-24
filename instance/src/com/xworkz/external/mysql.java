package com.xworkz.external;

import com.xworkz.internal.JDBC;

public class mysql implements JDBC
{
    public  void save() {
        System.out.println("running save in mysql");
    }
}
