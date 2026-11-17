# language: pt

Funcionalidade: Movimentar uma carteira digital

  Cenário: Depositar em carteira zerada
    Dado uma carteira com saldo de 0 reais
    Quando deposito 100 reais
    Então o saldo deve ser de 100 reais

  Cenário: Pagar com saldo suficiente
    Dado uma carteira com saldo de 100 reais
    Quando pago 40 reais
    Então o saldo deve ser de 60 reais

  Cenário: Recusar pagamento acima do saldo
    Dado uma carteira com saldo de 100 reais
    Quando tento pagar 120 reais
    Então o pagamento deve ser recusado
    E o saldo deve ser de 100 reais