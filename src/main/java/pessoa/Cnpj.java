package pessoa;

public class Cnpj {

	private String cnpj;
	
	public Cnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public boolean validaCnpj(String cnpj) {
		return false;
	}
	
}
