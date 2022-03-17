package classes;

public class CarroPasseio extends Veiculo {
	
	private String cor = " ";
	private String modelo= " ";

	public CarroPasseio( int pesoQuilos,
	                     int velocMax,
	                     float preco,
	                     Motor motor,
	                     String cor,
	                     String modelo ) 
	{
		                 super(pesoQuilos, velocMax, preco, motor );
		                 this.setPesoQuilos(pesoQuilos);
			             this.setVelocMax(velocMax);
			             this.setPreco(preco);
			             this.setMotor(motor);
		                 this.setCor(cor);
		                 this.setModelo(modelo);
	}
	
	public CarroPasseio() {
		super();
		this.setPesoQuilos(0);
        this.setVelocMax(0);
        this.setPreco(0);
        this.setMotor(null);
		this.setCor(" ");
		this.setModelo(" ");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString() {
		return "CARRO CADASTRADO COM SUCESSO" +
	           "Carro :" + modelo +
	           "Cor :" + cor +
	           "Preço:" + getPreco() +
	           "Motor:" + getMotor().getNumCilindro();
		       
		
	}

}
