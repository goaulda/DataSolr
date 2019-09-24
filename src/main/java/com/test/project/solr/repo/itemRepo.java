package com.test.project.solr.repo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.project.solr.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepo extends JpaRepository<Item, Long>, SolrCrudRepository<Item, Long> {
}
