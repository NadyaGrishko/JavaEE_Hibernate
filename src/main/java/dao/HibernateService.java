package dao;

import model.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateService implements ServiceDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addService(Service service) {
        currentSession().save(service);
    }
    public Service getServiceById(int id) {
        return (Service) currentSession().get(Service.class, id);
    }
    public void saveService(Service service) {
        currentSession().update(service);
    }
}