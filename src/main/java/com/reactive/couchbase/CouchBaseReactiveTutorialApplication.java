package com.reactive.couchbase;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.auditing.EnableReactiveCouchbaseAuditing;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Couchbase Reactive Application", version = "1.0", description = "Couchbase Reactive Application"))
@EnableReactiveCouchbaseAuditing
public class CouchBaseReactiveTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchBaseReactiveTutorialApplication.class, args);
	}

}
