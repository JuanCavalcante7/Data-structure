import java.io.BufferedReader;
import java.io.FileReader;

public class LeitorArquivo {

    public static void ler(String caminho, Pilha pilha) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(caminho));

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] palavras = linha.split(" ");

                ArvoreAVL arvore = new ArvoreAVL();

                for (int i = palavras.length - 1; i >= 0; i--) {

                    arvore.raiz = arvore.inserir(arvore.raiz, palavras[i]);

                }

                pilha.empilhar(arvore);

            }

            br.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}