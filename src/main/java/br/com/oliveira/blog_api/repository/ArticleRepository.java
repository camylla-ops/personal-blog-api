package br.com.oliveira.blog_api.repository;

import br.com.oliveira.blog_api.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}