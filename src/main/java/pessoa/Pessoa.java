package pessoa;

import java.util.UUID;

public abstract class Pessoa {
	private String nome;
	private String id = UUID.randomUUID().toString();
	
	public Pessoa() {}

	public Pessoa(String nome, String id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public String getId() {
		return id;
	}
}
