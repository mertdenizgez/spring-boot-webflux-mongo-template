package com.mertdenizgez.template.configs;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.mertdenizgez.template")
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Value("${dbport}")
    private String port;

    @Value("${dbname}")
    private String dbname;

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {
        return dbname;
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplat() {
        return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }
}
