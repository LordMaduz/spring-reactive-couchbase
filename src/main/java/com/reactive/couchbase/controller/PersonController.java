package com.reactive.couchbase.controller;

import com.reactive.couchbase.model.Person;
import com.reactive.couchbase.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @PostMapping
    public Mono<Person> addPerson(@RequestBody final Mono<Person> personMono) {
        return personMono.flatMap(personRepository::save);
    }

    @GetMapping("/{id}")
    public Mono<Person> findById(@PathVariable final String id) {
        return personRepository.findById(id);
    }

    @GetMapping()
    public Flux<Person> find() {
        return personRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        return personRepository.deleteById(id);
    }

}