package org.belafia.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Article {
    private Long id;
    private String name;
    private String description;
    private Set<Author> authors;
    private Integer year;

    public Article() {
    }

    public Article(final String name, final String description, final Set<Author> authors, final Integer year) {
        this.name = name;
        this.description = description;
        this.authors = authors;
        this.year = year;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @OneToMany
    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(final Set<Author> authors) {
        this.authors = authors;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(final Integer year) {
        this.year = year;
    }
}
