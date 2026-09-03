public class FilaDeImpressao {
    private static FilaDeImpressao instance;

    private FilaDeImpressao() {
        // Construtor privado para evitar instâncias externas
    }

    public static FilaDeImpressao getInstance() {
        if (instance == null) {
            instance = new FilaDeImpressao();
        }
        return instance;
    }

    public void imprimir(String documento) {
        System.out.println("Imprimindo: " + documento);
    }
}