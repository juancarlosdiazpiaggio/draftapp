package com.jcdpess.DraftApp.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document
public class Draft {

    /*@Indexed is to add index values for class fields*/
    @Id
    private String id;
    private String name;
    private String description;
    private Integer price;
    private String location;
    private Date date;
    private String edition;

    public Draft(String name, String description, Integer price,
                 String location, Date date, String edition) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.location = location;
        this.date = date;
        this.edition = edition;
    }
}
