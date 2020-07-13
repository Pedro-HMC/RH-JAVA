package bate_papo_na_empresa;

public class Sala_do_Cafe {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Davy", "003.555.422-13");
		Funcionario f1 = new Funcionario("Kaline", "003.555.422-13", "CTPS");
		Gerente g1 = new Gerente("Pedro", "017.001.864-42", "CTPS", "Produção");
		
		System.out.println(p1.oi());
		System.out.println(f1.amigo()+f1.ola());
		System.out.println(g1.confus()+g1.ei());
		/*System.out.println(p1.ih());
		System.out.println(f1.getNome()+":"+f1.migue());
		System.out.println(g1.bronca());
		System.out.println(f1.ih());
		System.out.println(p1.gg());*/
	}

}


