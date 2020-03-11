import model.User;
import model.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import workers.WorkWithUser;
import workers.WorkWithService;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithUser worker = (WorkWithUser) context.getBean("user");
        User testUser = new User("User1", 3);
        worker.saveToDB(testUser);

        WorkWithService workWithService = (WorkWithService) context.getBean("serviceWorker");
        Service service = new Service("Jake", "Billins", new Date(), "+380675097865");
        service = workWithService.addService(service);
        service.setCellphone("+XXXXXXXXXXX");
        workWithService.saveService(service);
    }
}
