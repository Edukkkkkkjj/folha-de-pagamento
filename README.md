# Folha de Pagamento (Java)

Sistema de folha de pagamento em Java, feito como exercício da faculdade (Análise e Desenvolvimento de Sistemas – USJT).

Pratica orientação a objetos: classes e objetos, construtores, herança (`extends`/`super`) e listas (`ArrayList`).

## Tipos de trabalhador

| Tipo | Classe | Salário |
|---|---|---|
| Padrão | `Worker` | Salário base (R$ 2.000) |
| Comissionado | `ComissionWorker` | Base + % de comissão sobre as vendas |
| Produção | `ProductionWorker` | Base + quantidade de peças × valor por peça |

Cada trabalhador recebe uma matrícula automática na criação. A classe `Payroll` guarda todos numa lista e imprime a folha.

## Como rodar

```
javac *.java
java App
```

Um menu no terminal permite cadastrar trabalhadores e gerar a folha de pagamento.
