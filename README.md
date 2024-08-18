# 🔐 safe-pass

`safe-pass` é um serviço de validação de senhas desenvolvido em Java 21 e Spring Boot. Ele garante que as senhas atendam aos requisitos de segurança, como comprimento mínimo, presença de letras maiúsculas e minúsculas, caracteres especiais e a ausência de dígitos sequenciais.

## 🚀 Funcionalidades

O serviço realiza as seguintes validações:
- ✅ **Comprimento mínimo**: A senha deve ter pelo menos 8 caracteres.
- ✅ **Letras maiúsculas**: A senha deve conter pelo menos uma letra maiúscula.
- ✅ **Letras minúsculas**: A senha deve conter pelo menos uma letra minúscula.
- ✅ **Caractere especial**: A senha deve conter pelo menos um caractere especial (por exemplo, `@`, `#`, `!`).
- ✅ **Dígitos sequenciais**: A senha não deve conter dígitos sequenciais (exemplo: `123`, `456`).

## 🛠️ Tecnologias Utilizadas

- **Java 21**: Utiliza a versão mais recente do Java para melhor performance e funcionalidades.
- **Spring Boot**: Framework que simplifica o desenvolvimento de aplicações em Java.
  - **Spring Web**: Usado para construção da API REST.
  - **Controle e Injeção de Dependências**: Implementado para garantir a modularidade e escalabilidade do código, facilitando a manutenção e adição de novas funcionalidades.
- **Regex**: Expressões regulares são usadas para realizar todas as validações de senha, garantindo uma verificação precisa e eficiente.

## 📦 Como Rodar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/safe-pass.git
   ```
2. **Acesse o diretório do projeto:**
   ```bash
   cd safe-pass
   ```
3. **Execute o projeto:**
    ```bash
   ./mvnw spring-boot:run
   ```  
4. **Utilize a API para validar senhas:**
   - A API estará disponível em http://localhost:8080.
   - Envie uma senha para validação através de uma requisição POST para o endpoint /validate-password.

## 📋 Exemplo de Requisição
Faça uma requisição POST para /validate-password com um corpo JSON contendo a senha a ser validada:
 ```json
{
  "password": "SuaSenha@123"
}
```
A resposta será uma lista de mensagens de erro caso a senha não atenda a algum dos critérios de validação.

## 👨‍💻 Contribuindo
1. Faça um fork do projeto.
2. Crie uma nova branch: git checkout -b minha-nova-funcionalidade.
3. Faça suas alterações e commite: git commit -m 'Adicionar nova funcionalidade'.
4. Faça o push para a branch: git push origin minha-nova-funcionalidade.
5. Envie um Pull Request.

## 📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

