import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Created by rhartley on 1/27/2016.
 */
public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
