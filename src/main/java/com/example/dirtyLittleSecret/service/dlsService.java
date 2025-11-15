package com.example.dirtyLittleSecret.service;

import com.example.dirtyLittleSecret.model.dlsModel;
import com.example.dirtyLittleSecret.repository.dlsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dlsService {

    @Autowired
    dlsRepo dlsRepo;

    public void postSecretService(String secret) {
        dlsModel dlsModel = new dlsModel(secret);
        dlsRepo.save(dlsModel);
    }

    public String getRandomService() {
        dlsModel randModel = dlsRepo.randModel();
        return randModel.getMessage();
    }

    public List<dlsModel> allSecretsService() {
        return dlsRepo.findAll();
    }
}
