package br.com.oliveira.blog_api.dto;

import jakarta.validation.constraints.NotBlank;

public record ArticleDTO(
    @NotBlank String title, 
    @NotBlank String content
) {}