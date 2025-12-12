package br.com.oliveira.blog_api.exception;


public class ArticleNotFoundException extends RuntimeException {
    public ArticleNotFoundException(Long id) {
        super("Artigo não encontrado com o ID: " + id);
    }
}