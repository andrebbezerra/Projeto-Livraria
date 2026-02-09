# Projeto Livraria - Estudo de Java e Orientação a Objetos

Este projeto é o resultado prático dos estudos do livro **"Desbravando Java e Orientação a Objetos"** de Rodrigo Turini, publicado pela editora Casa do Código. O objetivo foi aplicar os conceitos fundamentais e avançados da linguagem Java e do paradigma de Orientação a Objetos em um sistema de livraria funcional.

## Sobre o Projeto

O sistema simula as operações básicas de uma livraria, como o gerenciamento de diferentes tipos de produtos (livros físicos, ebooks, revistas), a gestão de um carrinho de compras, a aplicação de descontos e o registro de vendas. A estrutura do código foi desenvolvida para refletir as boas práticas de design e organização, seguindo a evolução dos capítulos do livro.

## Conceitos e Padrões Aplicados

O desenvolvimento deste projeto permitiu a aplicação prática de uma vasta gama de conceitos de engenharia de software e do paradigma de Orientação a Objetos. A tabela a seguir resume os principais conceitos implementados:

| Conceito | Descrição da Aplicação |
| :--- | :--- |
| **Abstração** | A classe `Livro` é uma classe abstrata que define a estrutura base para todos os tipos de livros, contendo atributos e métodos comuns. |
| **Encapsulamento** | A proteção dos dados das classes é garantida pelo uso de modificadores de acesso `private`, com acesso controlado por meio de métodos `getters` e `setters`. |
| **Herança** | As classes `LivroFisico`, `Ebook` e `MiniLivro` herdam da classe `Livro`, especializando seus comportamentos e atributos. |
| **Polimorfismo** | O sistema utiliza o polimorfismo para tratar diferentes tipos de produtos de forma unificada, por exemplo, ao adicionar itens ao carrinho de compras ou ao calcular o valor total. |
| **Interfaces** | As interfaces `Produto` e `Promocional` definem contratos que as classes devem seguir, garantindo a coesão e o baixo acoplamento entre os componentes do sistema. |
| **Collections Framework** | O projeto utiliza `List` e `Map` para gerenciar coleções de dados, como os produtos no carrinho de compras e os cupons de desconto. |
| **Tratamento de Exceções** | Foram criadas exceções customizadas para lidar com erros específicos da aplicação, como `AutorNuloException`, tornando o sistema mais robusto. |
| **Padrões de Projeto** | Foram implementados padrões como **Strategy** para as regras de desconto e **Composite** para a estrutura do carrinho de compras. |

## Estrutura do Código

O código-fonte está organizado em pacotes que separam as responsabilidades, facilitando a manutenção e a compreensão do sistema:

-   `br.com.batista.livraria`: Contém as classes principais e de base, como `Autor` e `Editora`.
-   `br.com.batista.livraria.produtos`: Agrupa todas as classes relacionadas aos produtos da livraria, incluindo as classes de livro, a interface `Produto` e o `CarrinhoDeCompras`.
-   `br.com.batista.livraria.exception`: Contém as classes de exceção personalizadas.
-   `br.com.batista.livraria.teste`: Inclui classes para testar as funcionalidades do sistema.

## Tecnologias Utilizadas

-   **Java**: Linguagem principal utilizada para o desenvolvimento de todo o sistema.
-   **Apache Ant**: Ferramenta de automação de build utilizada para compilar o projeto, conforme o arquivo `build.xml`.
-   **NetBeans IDE**: O projeto inclui configurações específicas para o ambiente de desenvolvimento NetBeans (`nbproject`).

## Como Executar o Projeto

1.  Clone o repositório para a sua máquina local.
2.  Importe o projeto em sua IDE Java de preferência (Eclipse, IntelliJ, NetBeans, etc.).
3.  Localize a classe principal de teste no pacote `br.com.batista.livraria.teste` e execute-a para ver o sistema em funcionamento.

---

*Este README foi gerado para servir como um portfólio e demonstrar a aplicação prática dos conhecimentos adquiridos. Desenvolvido por André Batista Bezerra.*
