package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;
public class TestandoClassesFilhas {
	public static void main (String[]args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Daniel Dev");
		aluno.setNomeEscola("JDev Treinamento");
		aluno.setIdade(20);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("aa4a4a4a4a4");
		diretor.setNome("Mr Dan");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("4aasasas445as");
		secretario.setIdade(30);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(" Salário Aluno é = " + aluno.salario());
		System.out.println(" Salário Diretor é = " + diretor.salario());
		System.out.println(" Salário Secretario é = " + secretario.salario());
	
		
	}

}
