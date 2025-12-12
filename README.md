# 📝 Personal Blog API

API desenvolvida para gerenciamento de artigos em uma plataforma de blog pessoal.
O foco deste MVP é demonstrar domínio das operações CRUD fundamentais, organização em camadas e boas práticas do ecossistema Spring.

## 🚀 Tecnologias Utilizadas

* **Java 21** (LTS)
* **Spring Boot 3**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória para desenvolvimento)
* **Lombok** (Produtividade e redução de boilerplate)
* **Validation** (Regras de validação de dados)

## ⚙️ Funcionalidades Atuais (MVP)

* **CRUD Completo de Artigos:**
    * Criar novo artigo (POST)
    * Listar todos os artigos (GET)
    * Buscar artigo por ID (GET)
    * Atualizar artigo (PUT)
    * Deletar artigo (DELETE)
* **Tratamento de Erros:** Respostas de erro padronizadas (RFC 7807) utilizando `ProblemDetail`.
* **Validação de Dados:** Impedimento de cadastro de artigos sem título ou conteúdo.

## 🔮 Roadmap (Próximos Passos de Evolução)

Este projeto foi estruturado para crescer. As próximas implementações planejadas para elevar o nível da aplicação são:

- [ ] **Paginação e Ordenação:** Implementar `Pageable` para otimizar a listagem de grandes volumes de artigos.
- [ ] **Filtros de Busca:** Adicionar capacidade de buscar artigos por palavras-chave no título (Query Methods).
- [ ] **Auditoria de Dados:** Incluir campo `updatedAt` com `@UpdateTimestamp` para rastrear edições.
- [ ] **Segurança:** Implementar autenticação básica (Spring Security) para proteger as rotas de escrita (POST/PUT/DELETE).
- [ ] **Deploy:** Containerização com Docker e deploy na nuvem (Render).

---
Desenvolvido por **Camylla Oliveira** 💜
