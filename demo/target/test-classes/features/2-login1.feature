# language: pt
Funcionalidade: Testes de login

  Cenario: <nome_do_cenario>
    Dado que o usuario está na tela de login
    Quando preenche o campo de <email> e <password>
    E clica no botão SIGN IN
    Então deve o usuario deve ter <resultado>

    Exemplos: 
      | nome_do_cenario                                                                  | email                                                 | password                                              | resultado            |
      | "Login válido com credenciais corretas"                                          | "rafamour03@gmail.com"                                | "Rascunho69#"                                         | "Login com sucesso"  |
      | "Login invalido com Email correto e password errado"                             | "rafamour03@gmail.com"                                | "Rascuno69*"                                          | "Login com invalido" |
      | "Login invalido com Email errado e password correto"                             | "rafaelmoura@gmail.com"                               | "Rascunho69#"                                         | "Login com invalido" |
      | "Login invalido com formatação de Email incorreto e password correto"            | "rafaelmouragmail,com"                                | "Rascunho69#"                                         | "Login com invalido" |
      | "Login invalido com Email correto e password sem formatação correta que se pede" | "rafamour03@gmail.com"                                | "Rascunho"                                            | "Login com invalido" |
      | "Login invalido com Email acima de 50 caracteres e password correto"             | "rafaelmour03rafaelmour03rafaelmo@gmail.comgmail.com" | "Rascunho69#"                                         | "Login com invalido" |
      | "Login invalido com Email correto e password acima de 50 caracteres"             | "rafamour03@gmail.com"                                | "Rascunho69#Rascunho69#Rascunho69#Rascunho69#Rascunh" | "Login com invalido" |
      | "Login invalido com Email e senha sem cadastro."                                 | "rafaelmoura12@gmail.com"                             | "rafaelMoura12*"                                      | "Login com invalido" |
