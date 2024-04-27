# language: pt

Funcionalidade: Testes de ícone login

  Cenario: <icone_login_clicavel>
  
    Dado que o usuário está na tela principal
    Quando clica no botão <signIn>
    Então usuário deve ter acesso a <conta>

    Exemplos:
    |nome do cenario                           | tela principal           | conta    | 
    |"Que o usuário está na tela principal"    | "clica no botão sign in" | "sucesso"| 

