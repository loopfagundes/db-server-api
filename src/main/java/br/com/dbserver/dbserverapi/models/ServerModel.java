package br.com.dbserver.dbserverapi.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db-server-api")
public class ServerModel {

    @Id
    private String id;
    private String title;
    private String image;
    private int number;

    public ServerModel(String title, String image, int number) {
        this.title = title;
        this.image = image;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getNumber() {
        return number;
    }
}