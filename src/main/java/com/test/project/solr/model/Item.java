package com.test.project.solr.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@SolrDocument(collection = "data")
public class Item implements Serializable {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Indexed(name = "id", type = "String")
    String id;

    @Indexed(name = "nameItem", type = "string")
    String nameItem;

    @Indexed(name = "quantity", type = "string")
    String quantity;

    @Indexed(name = "disc", type = "string")
    String disc;

    @Indexed(name = "price", type = "double")
    Double price;

    @Indexed(name = "currency", type = "string")
    String currency;


}
