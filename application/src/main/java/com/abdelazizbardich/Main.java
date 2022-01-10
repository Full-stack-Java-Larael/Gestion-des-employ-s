package com.abdelazizbardich;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;
import java.io.File;

public class Main {

    public static void main(String[] args){
        Configuration c = new Configuration().configure();
        SessionFactory sf = c.buildSessionFactory();

    }
}
