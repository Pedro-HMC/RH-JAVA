package bate_papo_na_empresa;

public class Gerente extends Funcionario{
	
	private String Atuacao;
	
	public String getAtuacao() {
		return this.Atuacao;
	}
	
	public Gerente(String nome, String cpf, String CarteiraTrabalho, String Atuacao) {
		super(nome, cpf, CarteiraTrabalho);
		this.Atuacao = Atuacao;
	}
	
	public String ei() {
		return "Cadê o relatório???";
	}
	
	public String confus() {
		return super.amigo() + super.ola();
	}
	
	/*public String bronca() {
		return this.getNome() + ": Não venha com essa de:'" + super.migue()+ "' falem logo.";
	}*/
	
	
}
