import java.util.Stack;

public class Pilha {

    Stack<ArvoreAVL> pilha = new Stack<>();

    public void empilhar(ArvoreAVL arvore) {

        pilha.push(arvore);

    }

    public ArvoreAVL desempilhar() {

        return pilha.pop();

    }

    public boolean vazia() {

        return pilha.isEmpty();

    }
}