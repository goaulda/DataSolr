package com.test.project.solr.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import javax.annotation.Resource;

//@Configuration
//@EnableSolrRepositories(basePackages = {"com.test.project.solr.repo"})
//@ComponentScan
public class SolrCofing {

    @ComponentScan
    public class SolrConfig {

        @Value("spring.data.solr.host")
        String solrURL;

        @Bean
        public SolrClient solrClient() {
            return new HttpSolrClient.Builder(solrURL).build();
        }
        @Bean
        public SolrTemplate solrTemplate(SolrClient client) throws Exception {
            return new SolrTemplate(client);
        }
    }
}
