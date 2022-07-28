package br.com.dbserver.dbserverapi.repositories;

import br.com.dbserver.dbserverapi.models.ServerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServerRepository extends MongoRepository<ServerModel, String> {

}