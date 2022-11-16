package org.belafia.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.belafia.model.Author;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorRepository implements PanacheRepository<Author> {
}
