# language: pt

Funcionalidade: Testes de ícone cart

  Cenario: <icone_cart_clicavel>
  
    Dado que o usuário esta na tela home do site 
    Quando ele tenta acessar o carrinho sem ter feito login
    Então usuário deve ter vizualização do <carrinho>

    Exemplos:
    |icone_cart_clicavel                                      | home                                  | carrinho     | 
    |"que o usuário esta na tela home do site"                | "clica no botão cart sem fazer login" | "sucesso"| 