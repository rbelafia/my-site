package org.belafia;

import org.belafia.model.Article;
import org.belafia.model.Author;
import org.belafia.repository.ArticleRepository;
import org.belafia.repository.AuthorRepository;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class SiteResource {

    @Inject
    AuthorRepository authorRepository;

    @Inject
    ArticleRepository articleRepository;

    @Query
    @Description("Return all articles")
    public List<Article> getArticles() {
        return articleRepository.listAll();
    }

    @Query
    @Description("Return all authors")
    public List<Author> getAuthors() {
        return authorRepository.listAll();
    }
}