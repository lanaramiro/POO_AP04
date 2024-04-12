public class Caminhonete extends Veiculos{

  public Caminhonete (Veiculos veiculo){
    this.pesokg = veiculo.pesokg; 
  }
  public void caminhoneteFurgao(){
    if(this.pesokg < 3000){
      System.out.println("R$ 25,00 por hora");
    }
  }
  public void caminhoneteFurgaoCar(){
    if(this.pesokg > 3000.1 && this.pesokg <= 6000){
      System.out.println("R$ 50,00 por hora");
    }
  }
}