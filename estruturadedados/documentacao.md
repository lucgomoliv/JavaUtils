# Documento para consulta da biblioteca `estruturadedados`

## Interface `IDado`

>Representa uma interface usada para generalização dos dados que entram na classe `Fila` e `Elemento`. Qualquer classe que queira usar na `Fila`, deve implementar, **necessariamente**, a interface `IDado`.

Exemplo de Uso:

```java
    public class Cliente implements IDado{
        ...
        Cliente(int rg, String nome, String endereco){
            this.rg = rg;
            this.nome = nome;
            this.nome = endereco;
        }
        ...
        public getID(){
            return this.rg;
        }

        @Override
        public int compareTo(Cliente cliente){
            return this.nome.compareTo(cliente.nome);
        }
    }
```

>Deve-se implementar o método `getID` e sobrescrever o método `compareTo`.

## Classe `Elemento`

>Usada apenas pela classe `Fila` para guardar os dados e definir o próximo elemento da fila.

```java
    ...
    private Elemento ultimo, primeiro;

    public Fila(){
        this.ultimo = this.primeiro = new Elemento(null);
    }
    //Trecho retirado do código fonte da classe `Fila.java`
    ...
```

## Classe `Fila`

>Usada para criar filas de dados. Como toda fila, tem as carecterísticas de retirar o primeiro elemento e adicionar no último lugar da fila.

Exemplo de uso:

```java
    ...
    Fila fila = new Fila();
    Cliente cliente = new Cliente(12345678, "José", "Rua Josefina");
    fila.adicionarElemento(cliente);
    fila.retirarElemento();
    if(fila.isEmpty()) System.out.println("Fila vazia!");
    ...
```
