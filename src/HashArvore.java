public class HashArvore {

    public static String gerarHash(NoAVL no) {

        if (no == null)
            return "";

        String hashEsq = gerarHash(no.esquerda);
        String hashDir = gerarHash(no.direita);

        String combinado = hashEsq + hashDir + no.valor;

        return HashSHA1.gerarHash(combinado);
    }
}