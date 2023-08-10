import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Arrays (vetores) com os produtos disponíveis em estoque
        int codigoProduto[] = { 11, 32, 8 };
        String nomeProduto[] = { "Computador", "Notebook", "Monitor" };
        double valorProduto[] = { 3500, 5000, 2500 };

        // Inicia uma Lista vazia do tipo Integer (este tipo é diferente de int)
        List<Integer> listaIndicesCarrinho = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\033[H\033[2J"); // Limpa a tela antes de Imprimir
            System.out.println("Bem-vindos ao Carrinho Turbo!");
            System.out.println("==================================");
            System.out.print("""
                    O que você deseja fazer agora?
                        1 - Adicionar Produto ao carrinho;
                        2 - Remover Produto do carrinho;
                        3 - Visualizar carrinho;
                        4 - Finalizar compra;
                        0 - Sair
                        Opção >>>  """);
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("\033[H\033[2J"); // Limpa a tela antes de Imprimir
                    System.out.println("Lista de produtos disponíveis:");
                    System.out.println("==================================");
                    for (int i = 0; i < valorProduto.length ; i++) {
                        //System.out.printf("Código do Produto: %d - %s - Valor: R$%.2f\n" ,codigoProduto[i], nomeProduto[i], valorProduto[i]);
                        System.out.print("Código do Produto: " + codigoProduto[i]);
                        System.out.print(" - " + nomeProduto[i]);
                        System.out.printf(" - Valor: R$%.2f\n", valorProduto[i]);
                        System.out.println("--------------------------------------");
                    }
                    System.out.println("Digite o código do produto que vc deseja adicionar ao carrinho?");
                    System.out.print("(Para retornar a tela anterior, digite 0 (zero))\n >>>");
                    int codSelecionado = scan.nextInt();
                    scan.nextLine(); //"limpar buff" de entrada
                    if (codSelecionado > 0) {
                        // Estrutura para verificar se o código informado pelo usuário existe no vetor
                        // codigoProduto
                        int indiceSelecionado = -1;
                        int i = 0;
                        for (int cod : codigoProduto) {
                            if (cod == codSelecionado) {
                                indiceSelecionado = i;
                                break;
                            }
                            i++;
                        }
                        if (indiceSelecionado == -1) // Se não existe então apresenta a mensagem
                            System.out.println("Produto não encontrado");
                        else { // Se existe adiciona na Lista o índice
                            System.out.println(
                                    "Produto << " + nomeProduto[indiceSelecionado] + " >> adicionado ao carrinho: ");
                            // System.out.println(codigoProduto[indiceSelecionado]);
                            // System.out.println(nomeProduto[indiceSelecionado]);
                            // System.out.println(valorProduto[indiceSelecionado]);
                            listaIndicesCarrinho.add(indiceSelecionado);
                        }
                        System.out.println("Pressione Enter para continuar");
                        scan.nextLine();
                    }
                    break;
                case 2:

                    break;
                case 3:
                     System.out.println("\033[H\033[2J"); // Limpa a tela antes de Imprimir
                    System.out.println("Meu Carrinho!");
                    System.out.println("==================================");
                    for (Integer indice : listaIndicesCarrinho) {
                        System.out.println(codigoProduto[indice]);
                        System.out.println(nomeProduto[indice]);
                        System.out.println(valorProduto[indice]);
                    }
                    scan.nextLine();
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Até breve!");
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    scan.nextLine();
                    break;
            }
        } while (opcao != 0 && opcao != 4);
    }
}
