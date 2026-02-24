## Sistema de Pedido - Prática de POO em Java
### 📌 Descrição

Projeto desenvolvido para praticar conceitos fundamentais de Programação Orientada a Objetos em Java, simulando a estrutura básica de um sistema de pedidos.

O foco está na modelagem de classes, relacionamento entre objetos e organização das responsabilidades dentro do domínio da aplicação.
 
---

#### 🧠 Conceitos Exercitados

- Encapsulamento

- Composição (objeto dentro de objeto)

- Separação de responsabilidades

- Uso de List e ArrayList

- Validação de dados em construtores

- Iteração com for-each

- Organização em pacotes (dominio e test)

### ⚙️ Como Funciona

- O sistema é composto por três entidades principais:

    - Produto → Representa um produto com nome e preço.

    - ItemPedido → Representa um produto associado a uma quantidade e calcula seu subtotal.

    - Pedido → Mantém uma lista de itens e calcula o valor total do pedido somando os subtotais.

- A execução ocorre na classe principal, onde:

    - Produtos são criados.

    - Itens são instanciados com produto e quantidade.

    - Os itens são adicionados ao pedido.

    - O total do pedido é calculado e exibido.