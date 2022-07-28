package br.com.dbserver.dbserverapi.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "yugioh_api")
public class ServerModel {

    @Id
    private String id;
    private String title;
    private String image;
    private int level;

    public ServerModel(String title, String image, int level) {
        this.title = title;
        this.image = image;
        this.level = level;
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

    public int getLevel() {
        return level;
    }
}