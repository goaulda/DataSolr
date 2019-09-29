package com.test.project.solr.repo;

import com.test.project.solr.model.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("itemRepo")
public interface ItemRepo extends SolrCrudRepository<Item, String> {
}
