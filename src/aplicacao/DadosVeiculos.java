package aplicacao;

import java.util.Scanner;

import classes.Caminhao;
import classes.CarroPasseio;
import classes.Motor;

public class DadosVeiculos {

	public DadosVeiculos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);
      System.out.println("Novo cadastro: 1- Carro Passeio  2-Caminhão");
      int valor= entrada.nextInt();
      Motor motor = new Motor();
      if(valor==1) {
    	  CarroPasseio novo = new CarroPasseio();
    	  System.out.println("----- MOTOR -----");
    	  System.out.println("Informe o nª cilindro");
    	  motor.setNumCilindro(entrada.nextInt());
    	  System.out.println("Informe a potência");
    	  motor.setPotencia(entrada.nextInt());
    	  
    	  System.out.println("---- VEICULO : CARRO ---");
    	  System.out.println("Informe o peso em quilos do Carro");
    	  novo.setPesoQuilos(entrada.nextInt());
    	  System.out.println("Informe a velocidade do Carro");
    	  novo.setVelocMax(entrada.nextInt());;
    	  System.out.println("Informe o preço do Carro");
    	  novo.setPreco(entrada.nextInt());
    	  System.out.println("Informe a cor do Carro");
    	  novo.setCor(entrada.nextLine());
    	  System.out.println("Informe o modelo do Carro");
    	  novo.setModelo(entrada.nextLine());
    	  novo.setMotor(motor);
    	  System.out.println(novo.toString());

    	  

    
      }else {
    	  Caminhao novo = new Caminhao();
    	  System.out.println("Informe as informações do motor");
    	  System.out.println("Informe o nª cilindro");
    	  motor.setNumCilindro(entrada.nextInt());
    	  System.out.println("Informe a potência");
    	  motor.setPotencia(entrada.nextInt());
    	  
    	  System.out.println("---- VEICULO : CAMINHÃO ---");
    	  System.out.println("Informe o peso em quilos do Caminhao");
    	  novo.setPesoQuilos(entrada.nextInt());
    	  System.out.println("Informe a velocidade do Caminhao");
    	  novo.setVelocMax(entrada.nextInt());;
    	  System.out.println("Informe o preço do Caminhao");
    	  novo.setPreco(entrada.nextInt());
    	  System.out.println("Informe a carga máxima");
    	  novo.setCargaMax(entrada.nextInt());
    	  System.out.println("Informe o altura máxima");
    	  novo.setAlturaMax(entrada.nextInt());
    	  System.out.println("Informe o comprimento do Caminhao");
    	  novo.setComprimento(entrada.nextInt());
    	  novo.setMotor(motor);
    	  System.out.println(novo.toString());
    	  
      }
      
	}

}
