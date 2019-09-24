package com.test.project.solr.config;


@Configuration
@EnableSolrRepositories(
        basePackages = "com.baeldung.spring.data.solr.repository",
        namedQueriesLocation = "classpath:solr-named-queries.properties",
        multicoreSupport = true)
@ComponentScan
public class SolrConfig {

    @Bean
    public SolrClient solrClient() {
        return new HttpSolrClient("http://localhost:8983/solr");
    }

    @Bean
    public SolrTemplate solrTemplate(SolrClient client) throws Exception {
        return new SolrTemplate(client);
    }
}