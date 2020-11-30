package com.javainuse.service;

import com.javainuse.entities.Application;
import com.javainuse.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class ApplicationService {
    static final int creditLimitMultiplier = 4;

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<Application> getById(Long id) {
        Application application = applicationRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Sonuç bulunamadı."));
        return ResponseEntity.ok(application);
    }

    public ResponseEntity<List<Application>> getAll() {
        return ResponseEntity.ok().body(applicationRepository.findAll());
    }


    public boolean didSendSms() {
        boolean score = restTemplate.getForObject("http://localhost:8080/sms/send", boolean.class);
        return score;
    }

    public Application save(Application application) {


            Random rand = new Random();
            int creditScore = rand.nextInt(1700);

            if(creditScore < 500 && creditScore > 0) {
                application.setCheckState("red");
            }
            else if(creditScore >= 500 && creditScore<1000 && application.getSalary() < 5000){
                if(didSendSms()) {
                    application.setCheckState("onay");
                    application.setCreditLimit((long) 10000);
                }
            }
            else if(creditScore>1000) {
                if(didSendSms()){
                    application.setCheckState("onay");
                    application.setCreditLimit(application.getSalary() * creditLimitMultiplier);
                }
            }
            return applicationRepository.save(application);

    }

}
