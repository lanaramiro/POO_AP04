import java.util.Scanner;

public class Veiculos{

  Scanner scanner = new Scanner(System.in);
  
  double pesokg;


  public void quantoPesa(){
    System.out.println("Quanto pesa o veículo?");
    this.pesokg = scanner.nextDouble();
  }
  
  public void verificarPesokg(){
  if (this.pesokg > 6000){
  System.out.println("Veículo muito pesado, não pode estacionar");
  }
}
}