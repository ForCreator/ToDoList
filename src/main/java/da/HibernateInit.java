package da;

import entities.Task;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class HibernateInit {
    private HibernateInit(){}
    private static final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder().configure().build();


    private static final SessionFactory sessionFactory = new MetadataSources( registry )
                .addAnnotatedClass(Task.class)
                .buildMetadata().buildSessionFactory();


    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

