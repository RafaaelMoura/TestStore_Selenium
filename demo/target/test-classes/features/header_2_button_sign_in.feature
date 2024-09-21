# language: pt

Funcionalidade: Testes de ícone login

  Cenario: <icone_login_clicavel>
  
    Dado que o usuário está na tela principal
    Quando ele clica no botão <sign_in>
    Então usuário deve ter acesso a <conta>

    Exemplos:
    |icone_login_clicavel                           | sign_in                        | conta    | 
    |"Que o usuário está na tela principal"         | "ele clica no botão sign in"   | "sucesso"| 