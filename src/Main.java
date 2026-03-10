public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        LeitorArquivo.ler("texto.txt", pilha);

        while (!pilha.vazia()) {

            ArvoreAVL arvore = pilha.desempilhar();

            String hash = HashArvore.gerarHash(arvore.raiz);

            System.out.println(hash);
        }
    }
}