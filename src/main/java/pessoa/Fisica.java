package pessoa;

public class Fisica extends Pessoa {
	private Cpf cpf;
	private Rg rg;
	
	public Fisica() {
		super();
	}
	
	public Fisica(String nome, String id, Cpf cpf, Rg rg) {
		super(nome, id);
		this.cpf = cpf;
		this.rg = rg;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public Rg getRg() {
		return rg;
	}
		
}
