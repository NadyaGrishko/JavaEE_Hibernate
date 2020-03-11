package workers;

import dao.ServiceDao;
import model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class WorkWithService {
    @Autowired
    private ServiceDao serviceDao;

    public Service addService(Service service) {
        serviceDao.addService(service);
        System.out.println("Service has been added " + service);
        return service;
    }

    public Service getServiceById(int id) {
        return ServiceDao.getServiceById(id);
    }

    public void saveService(Service service) {
        serviceDao.saveService(service);
        System.out.println("Service has been saved " + service);
    }
}
