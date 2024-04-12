import java.util.Scanner;

public class Carro extends Veiculos{

  Scanner scanner = new Scanner(System.in);

  public Carro (Veiculos veiculo){
    this.pesokg = veiculo.pesokg;  
  }

  public void pesoFurgao(){
    if(this.pesokg > 2000 && this.pesokg < 3000){
      System.out.println("R$ 25,00 por hora");
    }
    else if(this.pesokg > 3000.1 && this.pesokg <= 6000){
      System.out.println("R$ 50,00 por hora");
    }
  }
  
  public void perguntaTipo(){
    if(this.pesokg <= 2000){
    System.out.println("Qual o tipo do carro?");
    System.out.println("1 - Hatchback \n2 - Sedan \n3 -SUV");
    int tipoCarro = scanner.nextInt();
    if(tipoCarro == 1){
      System.out.println("R$13,00 por hora");
    }
    else if(tipoCarro == 2){
      System.out.println("R$15,00 por hora");
    }
    else if(tipoCarro == 3){
      System.out.println("R$20,00 por hora");
      }
    }
  }
}