package com.javainuse.service;


import com.javainuse.entities.Application;
import com.javainuse.repository.ApplicationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ApplicationServiceTest {

    @InjectMocks
    private ApplicationService applicationService;

    @Mock
    private ApplicationRepository applicationRepository;


    @Test
    public void getById() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getScore() {
    }

    @Test
    public void save() {
        Application application = new Application();
        application.setName("Test-Name");
        application.setIdentityNo("1231231231");
        application.setPhone("1231231231");
        application.setSalary((long)123123);

        Application applicationMock = Mockito.mock(Application.class);

        Mockito.when(applicationRepository.save(ArgumentMatchers.any(Application.class))).thenReturn(applicationMock);

        Application result = applicationService.save(application);

        Assertions.assertNotNull(result.getId());

    }
}
