# language: pt

Funcionalidade: Teste em button Contact Us

  Cenario: <icone_contactUs_clicavel>
  
    Dado que o usuário está na tela principal <home>
    Quando clica no botão <contactUs>
    Então usuario deve ter acesso a pagina de <contatos>

    Exemplos:
    |icone_contactUs_clicavel                                        | contactUs                          | contatos   |
    |"Dado que o usuário está na tela principal"                     | "Quando clica no botão contact us" | "sucesso"  |