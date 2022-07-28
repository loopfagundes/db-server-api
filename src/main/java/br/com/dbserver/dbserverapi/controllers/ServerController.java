package br.com.dbserver.dbserverapi.controllers;

import br.com.dbserver.dbserverapi.models.ServerModel;
import br.com.dbserver.dbserverapi.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping("/getServer")
    public List<ServerModel> getServer() {
        List<ServerModel> serverModels = serverRepository.findAll();
        return serverModels;
    }
}