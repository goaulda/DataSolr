package com.test.project.solr.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "item")
@SolrDocument(solrCoreName = "item")
public class Item {

    @Id
    @Indexed(name = "id", type = "Long")
    Long id;

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
