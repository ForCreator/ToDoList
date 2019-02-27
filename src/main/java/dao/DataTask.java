package dao;


import da.HibernateInit;
import entities.Task;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DataTask {
    private SessionFactory sessionFactory;
    public DataTask(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    //private final SessionFactory sessionFactory = HibernateInit.getSessionFactory();
    public List<Task> getAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Task.class);
        List list = criteria.list();

        transaction.commit();
        session.close();

        return (List<Task>) list;
    }


    public void save(String task){

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(new Task(task));

        transaction.commit();
        session.close();
    }

    public void delete(String task){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Task obj = (Task) session.createCriteria(Task.class).add(Restrictions.eq("task",task)).list().get(0);
        session.delete(obj);
        transaction.commit();
        session.close();
    }
}
