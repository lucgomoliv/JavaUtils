# Documento para consulta da biblioteca `estruturadedados`

## Interface `IDado`

>Representa uma interface usada para generalização dos dados que entram na classe **Fila** e **Elemento**. Qualquer classe que queira usar na **Fila**, deve implementar, **necessariamente**, a interface **IDado**.

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

>Deve-se implementar os métodos `getID` e sobrescrever o método `compareTo`