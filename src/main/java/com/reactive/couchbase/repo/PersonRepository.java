package com.reactive.couchbase.repo;


import com.reactive.couchbase.model.Person;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableReactiveCouchbaseRepositories
public interface PersonRepository extends ReactiveCouchbaseRepository<Person, String> {
}
