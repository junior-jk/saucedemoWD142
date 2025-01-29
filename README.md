# Selenium Test Project for SauceDemo

Este projeto contém testes automatizados utilizando o Selenium WebDriver para realizar ações no site de demonstração [SauceDemo](https://www.saucedemo.com/). O teste realiza login, seleção de produtos, checkout e logout.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para os testes.
- **Selenium WebDriver**: Framework para automação de navegação em browsers.
- **JUnit 5**: Framework para execução de testes.
- **WebDriverManager**: Biblioteca para gerenciar o driver do Chrome automaticamente.
- **Hamcrest**: Biblioteca para asserções no teste.

## Pré-requisitos

Antes de rodar os testes, certifique-se de ter o seguinte instalado:

- **Java 11 ou superior**: Para compilar e executar os testes.
- **Maven**: Para gerenciar dependências e compilar o projeto.
- **Chrome**: Navegador utilizado para a execução dos testes.
- **ChromeDriver**: Driver do Selenium para controlar o Chrome.

### Instalação

1. Clone o repositório para a sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

```markdown
# Selenium Test Project for SauceDemo

Este projeto contém testes automatizados utilizando o Selenium WebDriver para realizar ações no site de demonstração [SauceDemo](https://www.saucedemo.com/). O teste realiza login, seleção de produtos, checkout e logout.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para os testes.
- **Selenium WebDriver**: Framework para automação de navegação em browsers.
- **JUnit 5**: Framework para execução de testes.
- **WebDriverManager**: Biblioteca para gerenciar o driver do Chrome automaticamente.
- **Hamcrest**: Biblioteca para asserções no teste.

## Pré-requisitos

Antes de rodar os testes, certifique-se de ter o seguinte instalado:

- **Java 11 ou superior**: Para compilar e executar os testes.
- **Maven**: Para gerenciar dependências e compilar o projeto.
- **Chrome**: Navegador utilizado para a execução dos testes.
- **ChromeDriver**: Driver do Selenium para controlar o Chrome.

### Instalação

1. Clone o repositório para a sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd seu-repositorio
   ```

3. Se você estiver utilizando Maven, execute o seguinte comando para baixar as dependências:

   ```bash
   mvn clean install
   ```

4. Certifique-se de que o **Chrome** está instalado no seu sistema.

5. O **WebDriverManager** irá automaticamente gerenciar o driver necessário, portanto, não é necessário configurar manualmente o `chromedriver`.

## Executando os Testes

Para executar os testes, use o comando:

```bash
mvn test
```

Ou execute diretamente no seu IDE, como o **IntelliJ IDEA** ou **Visual Studio Code**, se já configurado corretamente.

## Descrição do Teste

### Caso de Teste: Seleção de Produto e Checkout

1. **Login**: O teste inicia acessando o site [SauceDemo](https://www.saucedemo.com/) e realizando o login com as credenciais padrão:
    - **Usuário**: `12121` Ver na pagina usuario e senha
    - **Senha**: `123`

2. **Seleção de Produto**: Após o login, o teste seleciona o produto "Sauce Labs Backpack" e adiciona ao carrinho.

3. **Carrinho de Compras**: O teste verifica se o produto foi adicionado corretamente ao carrinho.

4. **Checkout**: O teste preenche os dados de checkout (nome, sobrenome e código postal) e finaliza a compra.

5. **Confirmação de Pedido**: Após o checkout, o teste verifica a mensagem de confirmação de pedido.

6. **Logout**: O teste finaliza clicando no menu de navegação e realizando o logout.

## Estrutura do Projeto

O projeto possui a seguinte estrutura:

```
/src
  /test
    /java
      /test
        /java
          SelecionarProdutoTest.java    # Teste Selenium
/pom.xml                             # Arquivo de dependências Maven
README.md                            # Este arquivo
```

## Contribuições

Sinta-se à vontade para contribuir com o projeto! Se encontrar algum bug ou quiser adicionar novas funcionalidades, abra uma issue ou envie um pull request.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).
```

Esse `README.md` fornece uma explicação clara sobre como configurar, executar e entender os testes automatizados realizados com o Selenium WebDriver no site SauceDemo. Ele inclui etapas de instalação, execução de testes, e estrutura do projeto, bem como informações sobre contribuição e licença.
