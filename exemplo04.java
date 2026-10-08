class Veiculo {
    String marca;
    int ano;


    Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }


    void acelerar(){
      System.out.println("Veículo acelerando: ");
    }


    void exibirInfo() {
        System.out.println( "Marca: " + marca);
        System.out.println( "Ano: " + ano);
    }
}


class carro extends Veiculo {
  protected int numPortas;


  carro(String marca, int ano, int numPortas){
    super(marca, ano);
    this.numPortas = numPortas;
  }


  @Override
  void exibirInfo(){
    super.exibirInfo();
    System.out.println( "Número de portas: "+ numPortas);
  }


  @Override
  void acelerar(){
    super.acelerar();
    System.out.println("Acelerando o carro!!! ");
  }
}


class moto extends Veiculo{
  protected int cilindradas;
  moto(String marca, int ano, int cilindradas) {
  super(marca, ano);
  this.cilindradas = cilindradas;
  }


  @Override
  void exibirInfo(){
   super.exibirInfo();
   System.out.println("cilindradas: "+ cilindradas);
  }


  @Override
  void acelerar(){
    super.acelerar();
    System.out.println("Acelerando Moto!!!");
  }


}


public class Main {
    public static void main(String[] args) {
      System.out.println("Carro: ");
      carro carro1 = new carro("bmw", 2025, 4);
      carro1.exibirInfo();
      carro1.acelerar();


      System.out.println("Moto: ");
      moto moto1 = new moto("honda", 2025, 3);
      moto1.exibirInfo();
      moto1.acelerar();


    }
}
