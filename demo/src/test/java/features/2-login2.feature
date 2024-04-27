# language: pt
Funcionalidade: Testes de login

  Cenario: <funcionalidade_login>

    Dado que o usuario está na tela de <login>
    Quando preenche o campo de <email> e <password>
    E para conferir a senha clica em <show>
    Então o usuário deve ter <resultado>

    Exemplos: 
      | funcionalidade_login                      | email                    | password           | resultado                  |
      | "preenche campos com credenciais corretas"| "rafamour03@gmail.com"   | "Rascunho69#"      | "vizualizado com sucesso"  |
    