package classes;

public class Caminhao extends Veiculo {
	private int cargaMax = 0;
	private int alturaMax = 0;
	private int comprimento = 0;

	public Caminhao( int pesoQuilos,
                     int velocMax,
                     float preco,
                     Motor motor,
                     int cargaMax,
                     int alturaMax,
                     int comprimento
			       ) {
		             super(pesoQuilos,velocMax,preco, motor);
		             this.setPesoQuilos(pesoQuilos);
		             this.setVelocMax(velocMax);
		             this.setPreco(preco);
		             this.setMotor(motor);
		             this.setCargaMax(cargaMax);
		             this.setAlturaMax(alturaMax);
		             this.setComprimento(comprimento);
	}
	
	public Caminhao() {
		super();
		this.setPesoQuilos(0);
        this.setVelocMax(0);
        this.setPreco(0);
        this.setMotor(null);
        this.setCargaMax(0);
        this.setAlturaMax(0);
        this.setComprimento(0);
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public String toString() {
		return "CAMINHÃO CADASTRADO COM SUCESSO" +
	           "Altura :" + alturaMax +
	           "Carga Máxima:" + cargaMax +
	           "Preço:" + getPreco() +
		       "Motor:" + getMotor().getNumCilindro();
		       
		
	}
	
	

}
