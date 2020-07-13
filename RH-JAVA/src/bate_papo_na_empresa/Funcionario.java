package bate_papo_na_empresa;

public class Funcionario extends Pessoa {
	private String CarteiraTrabalho;
	
	public String getCarteira() {
		return this.CarteiraTrabalho;
	}
	
	public Funcionario (String nome, String cpf, String CarteiraTrabalho) {
		super(nome, cpf);
		this.CarteiraTrabalho = CarteiraTrabalho;
	}
	
	public String ola() {
		return " Bom dia! ";
	}
	
	public String amigo() {
	return super.oi();
	}
	
	/*public String migue() {
		return " Olha... Não sei de nada.";
	}*/
}
