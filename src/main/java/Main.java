
import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Quer adicionar um veículo?");
    System.out.println("2 - Sair");
    System.out.println("Digite 1 ou 2: ");
    int escolha = scanner.nextInt();

    if (escolha == 1) {
      System.out.println("Qual o tipo de veículo?");
      System.out.println("1 - Motocicleta \n2 - Carro \n3 - Caminhonete \n4 - Furgão");
      int tipoveiculo = scanner.nextInt();
      Veiculos veiculo = new Veiculos();
      veiculo.quantoPesa();
      veiculo.verificarPesokg();

      if(tipoveiculo == 1) {
        Motocicleta motocicletas = new Motocicleta(veiculo);
        motocicletas.motocicletaLeve();
        motocicletas.motocicletaPadrao();
        motocicletas.motocicletaPesada();
      }      
      else if(tipoveiculo == 2){
        Carro carros = new Carro(veiculo);
        carros.perguntaTipo();
        carros.pesoFurgao();
      }
      else if(tipoveiculo == 3){
        Caminhonete caminhonetes = new Caminhonete(veiculo);
        caminhonetes.caminhoneteFurgao();
        caminhonetes.caminhoneteFurgaoCar();
      }
      else if(tipoveiculo == 4){
        Caminhonete furgaos = new Caminhonete(veiculo);
        furgaos.caminhoneteFurgao();
        furgaos.caminhoneteFurgaoCar();
      }
    } else if (escolha == 2) {
      System.out.println("Saindo...");
    } else {
      System.out.println("Opção inválida.");
    }
  }
}
