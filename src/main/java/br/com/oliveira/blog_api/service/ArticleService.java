package br.com.oliveira.blog_api.service;

import br.com.oliveira.blog_api.entity.Article;
import br.com.oliveira.blog_api.exception.ArticleNotFoundException;
import br.com.oliveira.blog_api.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository repository;

    // 1. Listar todos
    public List<Article> findAll() {
        return repository.findAll();
    }

    // 2. Buscar por ID (lança erro se não achar)
    public Article findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ArticleNotFoundException(id));
    }

    // 3. Salvar (Criar ou Atualizar)
    public Article save(Article article) {
        return repository.save(article);
    }

    // 4. Deletar
    public void delete(Long id) {
        repository.deleteById(id);
    }
}