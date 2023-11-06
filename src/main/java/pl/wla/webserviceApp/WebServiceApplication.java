package pl.wla.webserviceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.wla.webserviceApp.invoice.domain.service.VatRateService;
import pl.wla.webserviceApp.invoice.jpa.repository.VatRateRepository;

@SpringBootApplication


public class WebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class,args);

    }

}
