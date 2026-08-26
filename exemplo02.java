import java.util.*;


public class Main {
  
  public static class Conta {

    private double saldo = 0;

    public void depositar(double valor){
      if (valor > 0 ){ 
        saldo += valor;
      }
    }

    public void sacar(double valor) {
      if (valor > 0 && valor <= saldo) {
         saldo -= valor;
      }
    }

    public double consultarSaldo(){
      return saldo; 
    }
  }

  public static void main(String[] args){

    Conta conta = new Conta(); 

    conta.depositar(1000);
    conta.sacar(300);

    System.out.println(conta.consultarSaldo());
  }
}
