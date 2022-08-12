package br.com.dbserver.dbserverapi.controllers;

import br.com.dbserver.dbserverapi.exceptions.ResourceNotFoundException;
import br.com.dbserver.dbserverapi.models.ServerModel;
import br.com.dbserver.dbserverapi.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping("/cards")
    public List<ServerModel> getServer() {
        List<ServerModel> serverModel = serverRepository.findAll();
        return serverModel;
    }

    @GetMapping("/cards/{id}")
    public Optional<ServerModel> seachById(@PathVariable String id) {
        Optional<ServerModel> serverModel = serverRepository.findById(id);
        return serverModel;
    }

    @PostMapping("/cards")
    public ServerModel cadastrarServer(@RequestBody ServerModel serverModel) {
        ServerModel serverModelSave = serverRepository.save(serverModel);
        return serverModelSave;
    }

    @PutMapping("/cards/{id}")
    public ServerModel updateServer(@RequestBody ServerModel serverModel, @PathVariable String id) {
        ServerModel serverModelPut = serverRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ServerModel nao existe com id: " + id));
        serverModelPut.setTitle(serverModel.getTitle());
        serverModelPut.setImage(serverModel.getImage());
        serverModelPut.setLevel(serverModel.getLevel());
        return serverRepository.save(serverModelPut);
    }

    @DeleteMapping("/cards/{id}")
    public void deleteCard(@PathVariable String id) {
        serverRepository.deleteById(id);
    }
}