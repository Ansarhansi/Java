package com.xworkz.internal;

public class IplApp {
    private JDBC jdbc;//instance variable

    public IplApp(JDBC jdbc){
 this.jdbc=jdbc;
    }
    public void saveDetails(){
        if(this.jdbc!=null){
            System.out.println("running savedetails in iplapp");
            this.jdbc.save();
        }
        else{
            System.out.println("jbdc is full");
        }
    }


}
