import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // Atributo da classe
    String saida = "";

    // Construtor da classe
    public Main() {
        // Declarando uma nova fila com LinkedList
        Queue<Integer> queue = new LinkedList<Integer>();
        // Populando a lista
        adicionarElemento(queue);
        saida += "\n";
        // Removendo elementos da lista (FIFO)
        this.removerElemento(queue);

        // Configurando TextArea
        JTextArea saidaArea = new JTextArea();
        // Atribuindo a string com a queue à TextArea
        saidaArea.setText(saida);

        // Exibindo a TextArea com uma caixa de diálogo
        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Queues",JOptionPane.INFORMATION_MESSAGE);

        //Saindo da aplicação
        System.exit(0);
    }

    public static void main(String[] args) {
        new Main();
    }

    private void adicionarElemento(Queue qe) {
        // Adicionando 10 elementos em ordem descrescente
        int elemento = 10;
        for(int i=elemento; i>=0; i--) {
            saida += "Adicionando o elemento: " + i + " na fila\n";
            qe.add(i);
        }
    }

    private void removerElemento(Queue qe) {
        // Removendo elementos enquanto a fila não for vazia
        // utilizando FIFO (First In, First Out)
        while(!qe.isEmpty()) {
            saida += "Removendo o elemento: " + qe.remove() + " da fila\n";
        }
    }
}
