package pessoa;

public class Juridica extends Pessoa {

	private class CotaSociedade {
		//nested class
		private double percentualDeParticipacao;
		
	}
	
	private Cnpj cnpj;
	private double capitalSocial;
	
	public Cnpj getCnpj() {
		return cnpj;
	}
	
	public double getCapitalSocial() {
		return capitalSocial;
	}

	public Juridica() {
		super();
	}

	public Juridica(String nome, String id, Cnpj cnpj, double capitalSocial) {
		super(nome, id);
		this.cnpj = cnpj;
		this.capitalSocial = capitalSocial;
	}
	
	public void adicionarSocio(Pessoa socio, double percentualDeParticipacao) {
		
	}
	
	public void removerSocio(Pessoa socio) {
		
	}
	
	
}
