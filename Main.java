public class Main {
    public static void main(String[] args) {
        // Preparação: Solicitar a instância única da FilaDeImpressao
        FilaDeImpressao fila = FilaDeImpressao.getInstance();

        // O Molde: Criar um Certificado original usando new
        Certificado molde = new Certificado("Análise e Desenvolvimento de Sistemas");

        // A Clonagem: Criar duas cópias do certificado original
        Certificado clone1 = molde.clonar();
        Certificado clone2 = molde.clonar();

        // Personalização: Colocar o nome de dois alunos diferentes
        clone1.setNomeAluno("Diogo Marques");
        clone2.setNomeAluno("Cristiano Ronaldo");

        // Impressão: Enviar os dados dos dois clones para a fila de impressão
        fila.imprimir(clone1.getDados());
        fila.imprimir(clone2.getDados());

        // Validação obrigatória: Teste de memória do Prototype
        System.out.println("Teste de memoria (clone1 == clone2): " + (clone1 == clone2));
    }
}