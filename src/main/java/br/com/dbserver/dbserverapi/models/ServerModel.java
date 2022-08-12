package br.com.dbserver.dbserverapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "yugioh_api")
public class ServerModel {

    @Id
    private String id;
    private String title;
    private String image;
    private String level;

    public ServerModel(String title, String image, String level) {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}