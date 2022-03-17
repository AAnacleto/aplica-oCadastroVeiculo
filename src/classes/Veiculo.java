package classes;

public class Veiculo {
	private int pesoQuilos;
	private int velocMax;
	private float preco;
	private Motor motor;

	public Veiculo() {
		this.setPesoQuilos(0);
		this.setVelocMax(0);
		this.setPreco(0);
		this.setMotor(null);
	}
	
	public Veiculo( 
			int pesoQuilos,
			int velocMax,
			float preco,
		    Motor motor
    ) {
		this.setPesoQuilos(pesoQuilos);
		this.setVelocMax(velocMax);
		this.setPreco(preco);
		this.setMotor(motor);
		
	}

	public int getPesoQuilos() {
		return pesoQuilos;
	}

	public void setPesoQuilos(int pesoQuilos) {
		this.pesoQuilos = pesoQuilos;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}
