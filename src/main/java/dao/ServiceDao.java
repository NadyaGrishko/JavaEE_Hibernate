package dao;


import model.Service;

public interface ServiceDao {
    void addService(Service service);
    Service getServiceById(int id);
    void saveService(Service service);
}