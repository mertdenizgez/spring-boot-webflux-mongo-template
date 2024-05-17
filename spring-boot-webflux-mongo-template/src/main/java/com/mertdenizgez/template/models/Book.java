package com.mertdenizgez.template.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book implements Serializable {

    private String SSN;
    private String name;
    private String author;

}
