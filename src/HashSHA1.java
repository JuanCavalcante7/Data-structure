import java.security.MessageDigest;

public class HashSHA1 {

    public static String gerarHash(String texto) {

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] hash = md.digest(texto.getBytes());

            StringBuilder hex = new StringBuilder();

            for (byte b : hash) {

                hex.append(String.format("%02x", b));

            }

            return hex.toString();

        } catch (Exception e) {

            e.printStackTrace();
            return null;

        }
    }
}