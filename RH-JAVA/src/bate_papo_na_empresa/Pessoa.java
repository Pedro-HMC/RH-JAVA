package bate_papo_na_empresa;

public class Pessoa {
	private String nome;
	private String cpf;
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String oi() {
		return this.nome +": E ae, blz?";
	}
	
	/*public String ih(){
		return this.nome+" ...";
	}
	public String gg() {
		return this.nome+": Desculpa... A gente ficou jogando lol.";
	}*/
}
