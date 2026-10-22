# 🛒 Mini E-commerce em Java

Projeto desenvolvido em Java com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**, estruturas de dados, validação, tratamento de exceções e integração com banco de dados.

## 📌 Sobre o projeto

Este é um mini sistema de e-commerce desenvolvido para simular o gerenciamento de produtos de uma loja.

O projeto foi desenvolvido de forma incremental, permitindo aplicar novos conceitos de Java conforme os estudos avançam.

O projeto utiliza **MySQL com JDBC** para persistir e consultar dados de produtos, integrando a aplicação Java a um banco de dados relacional.

## ⚙️ Funcionalidades

* Cadastrar produtos
* Buscar produto pelo ID
* Listar produtos
* Alterar preço
* Alterar estoque
* Remover produtos
* Calcular o valor total do estoque
* Validar preço e estoque
* Tratar entradas inválidas
* Tratamento de exceções com `throw`, `try`, `catch` e `finally`
* Interface utilizando `JOptionPane`
* Integração inicial com MySQL utilizando JDBC
* Cadastro de produtos no banco de dados utilizando `INSERT`

## 🧠 Conceitos praticados

* Classes e objetos
* Construtores
* Encapsulamento
* Atributos `private`
* Métodos e getters
* `this`
* Programação Orientada a Objetos (POO)
* `Map`
* `HashMap`
* Laços de repetição
* Estruturas condicionais
* `switch`
* Validação de dados
* Exceções
* `throw`
* `try/catch`
* `finally`
* JDBC
* `Connection`
* `PreparedStatement`
* `executeUpdate()`
* MySQL
* Organização com packages
* Git e GitHub

## 🗂️ Estrutura do projeto

```text
📦 mini-ecommerce-java
├── 📁 src
│   └── 📁 ecommerce
│       ├── 📁 model
│       │   └── 📄 Produto.java
│       ├── 📁 dao
│       │   └── 📄 ProdutoDAO.java
│       └── 📁 util
│           └── 📄 Conexao.java
├── 📄 Ecommerce.java
├── 📄 README.md
└── 📄 .gitignore
```

## 🚀 Próximos passos

* Ampliar as validações de dados e o tratamento de erros.

* Desenvolver testes automatizados.

* Melhorar a documentação e a organização do código conforme a evolução do projeto.
