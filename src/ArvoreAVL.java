public class ArvoreAVL {
    NoAVL raiz;

    public NoAVL inserir(NoAVL no, String valor) {
        if (no == null) {
            return new NoAVL(valor);
        }

        if (valor.compareTo(no.valor) < 0) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor.compareTo(no.valor) > 0) {
            no.direita = inserir(no.direita, valor);
        }

        return no;
    }
}