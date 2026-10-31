# Folha de Pagamento (Java)

Sistema de folha de pagamento em Java, feito como exercício da faculdade (Análise e Desenvolvimento de Sistemas – USJT).

Pratica orientação a objetos: classes e objetos, construtor, herança (`extends`/`super`), sobrescrita de métodos (`@Override`), polimorfismo e listas (`ArrayList`).

## Tipos de trabalhador

| Tipo | Classe | Salário (`getSalary()`) |
|---|---|---|
| Padrão | `Worker` | Salário base (R$ 2.000) |
| Comissionado | `ComissionWorker` | Base + % de comissão sobre as vendas |
| Produção | `ProductionWorker` | Base + quantidade de peças × valor por peça |

Cada filho sobrescreve `getSalary()` com a sua própria conta. A classe `Payroll` guarda todos numa lista de `Worker` e, ao imprimir, o Java chama automaticamente a versão certa de cada um (polimorfismo).

## Como rodar

```
javac *.java
java App
```
