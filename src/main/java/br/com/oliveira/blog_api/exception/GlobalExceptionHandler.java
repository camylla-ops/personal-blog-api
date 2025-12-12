package br.com.oliveira.blog_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArticleNotFoundException.class)
    public ProblemDetail handleArticleNotFound(ArticleNotFoundException e) {
        // Recurso nativo do Spring Boot 3 para erros padronizados!
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        
        problemDetail.setTitle("Artigo não encontrado");
        problemDetail.setProperty("timestamp", Instant.now());
        
        return problemDetail;
    }
}