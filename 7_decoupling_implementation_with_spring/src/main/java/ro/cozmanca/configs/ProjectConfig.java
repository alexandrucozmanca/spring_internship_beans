package ro.cozmanca.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.cozmanca.proxies.InvoiceNotificationProxy;
import ro.cozmanca.proxies.beans.BeanInvoiceNotificationProxy;
import ro.cozmanca.proxies.impl.MockMailInvoiceNotificationProxy;
import ro.cozmanca.repositories.beans.BeanInvoiceRepository;
import ro.cozmanca.repositories.impl.MockDBInvoiceRepository;
import ro.cozmanca.services.beans.BeanInvoiceService;

@Configuration
@ComponentScan(basePackages = {"ro.cozmanca.proxies", "ro.cozmanca.repositories", "ro.cozmanca.services"})
public class ProjectConfig {

    @Bean("beanInvoiceRepository")
    public BeanInvoiceRepository beanInvoiceRepository() {
        return new BeanInvoiceRepository();
    }

    @Bean("beanInvoiceNotificationProxy")
    public BeanInvoiceNotificationProxy beanInvoiceNotificationProxy() {
        return new BeanInvoiceNotificationProxy();
    }


    @Bean("beanInvoiceService")
    public BeanInvoiceService beanInvoiceService(
            BeanInvoiceRepository repository,
            BeanInvoiceNotificationProxy notificationProxy) {

        return new BeanInvoiceService(repository, notificationProxy);
    }
}
