public class Motocicleta extends Veiculos{

public Motocicleta (Veiculos veiculo){
  this.pesokg = veiculo.pesokg;  
}
  
public void motocicletaLeve(){
  if(this.pesokg <= 100){
    System.out.println("R$ 2,00 por hora");
}
}

public void motocicletaPadrao(){
  if(this.pesokg >= 100.1 && this.pesokg <= 299.9){
    System.out.println("R$ 4,00 por hora");
}
}

  public void motocicletaPesada(){
    if(this.pesokg >= 300){
    System.out.println("R$ 10,00 por hora");
  }
  }
  
}