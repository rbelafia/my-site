package org.belafia.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.belafia.model.Article;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticleRepository implements PanacheRepository<Article> {
}
