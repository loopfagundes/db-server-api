package br.com.dbserver.dbserverapi.controllers;

import br.com.dbserver.dbserverapi.models.ServerModel;
import br.com.dbserver.dbserverapi.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping("/meu_api")
    public List<ServerModel> getServer() {
        List<ServerModel> serverModels = serverRepository.findAll();
        return serverModels;
    }

    @PostMapping("/meu_api")
    public ServerModel cadastrarServer(@RequestBody ServerModel serverModel) {
        ServerModel serverModelSave = serverRepository.save(serverModel);
        return serverModelSave;
    }

    @DeleteMapping("/meu_api/{id}")
    public void deleteCard(@PathVariable String id) {
        serverRepository.deleteById(id);
    }
}