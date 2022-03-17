package classes;

public class Motor {
	private int numCilindro;
	private int potencia;

	public Motor(int numCilindro, int potencia) {
		this.setNumCilindro(numCilindro);
		this.setPotencia(potencia);
		
	}
	
	public Motor() {
		this.setNumCilindro(0);
		this.setPotencia(0);
	}

	public int getNumCilindro() {
		return numCilindro;
	}

	public void setNumCilindro(int numCilindro) {
		this.numCilindro = numCilindro;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
