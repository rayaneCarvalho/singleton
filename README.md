# Impressora

Este é um projeto simples contendo uma implementação do padrão de projeto Singleton para uma classe `Impressora`, que permite definir e recuperar o número de páginas.

## Descrição

A classe `Impressora` possui métodos para definir o número de páginas a serem impressas e para recuperar esse número. Utiliza o padrão Singleton para garantir que apenas uma instância da classe seja criada.

### Padrão Singleton

O padrão Singleton é um padrão de projeto de criação que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Na implementação deste projeto, o padrão Singleton é aplicado à classe `Impressora` da seguinte maneira:

- O construtor da classe é definido como privado para impedir a criação de instâncias fora da classe.
- Uma instância estática privada é mantida na própria classe.
- Um método estático público `getInstance()` é fornecido para obter a instância única da classe.

## Como usar

Para utilizar a classe `Impressora`, siga estas etapas:

1. Clone este repositório em sua máquina local:

    ```
    [https://github.com/rayaneCarvalho/singleton.git]
    ```

2. Importe o projeto em seu ambiente de desenvolvimento Java.

3. Use a classe `Impressora` conforme necessário em seu código.

## Executando os Testes

Este projeto inclui testes unitários usando JUnit. Para executar os testes, siga estas etapas:

1. Certifique-se de ter instalado o Java Development Kit (JDK) em sua máquina.

2. Navegue até o diretório do projeto:

    ```
    cd seu-repositorio
    ```

3. Execute o comando Maven para compilar e testar o código:

    ```
    mvn test
    ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).
