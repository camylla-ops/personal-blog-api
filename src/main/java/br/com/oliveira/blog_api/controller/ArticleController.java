package br.com.oliveira.blog_api.controller;

import br.com.oliveira.blog_api.dto.ArticleDTO;
import br.com.oliveira.blog_api.entity.Article;
import br.com.oliveira.blog_api.service.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService service;

    @GetMapping
    public List<Article> listAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Article getById(@PathVariable Long id) {
        return service.findById(id);
    }

    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Article create(@RequestBody @Valid ArticleDTO dto) {
        // Conversão manual simples (DTO -> Entity)
        Article article = new Article();
        article.setTitle(dto.title());
        article.setContent(dto.content());
        
        return service.save(article);
    }

    @PutMapping("/{id}")
    public Article update(@PathVariable Long id, @RequestBody @Valid ArticleDTO dto) {
        Article article = new Article();
        article.setId(id);
        article.setTitle(dto.title());
        article.setContent(dto.content());
        
        return service.save(article);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}