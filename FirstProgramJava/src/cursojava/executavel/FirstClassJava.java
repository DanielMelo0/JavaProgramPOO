package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class FirstClassJava {

	
	public static void main (String[]args) {
		
		String login = JOptionPane.showInputDialog(null,"Informe a o login");
		String senha = JOptionPane.showInputDialog(null,"Informe a senha");
			
		
		//PermitirAcesso  secretario = new Secretario(); Idiretamente com objeto referenciando a interface
		// new Secretario().autenticar(login,senha)
					
		if (new FuncaoAutenticacao(new Diretor(login,senha )).autenticar()) { /*Travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo */
		
					
		List <Aluno> alunos = new ArrayList<Aluno>();
		
		/*É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores*/
		HashMap<String,List<Aluno>> maps = new HashMap<String,List<Aluno>>();
		 
		 for (int qtd = 1 ; qtd <=5 ; qtd++)  {
		 
 		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd + " ?");
			/*String idade = JOptionPane.showInputDialog("Qual a idade?");
			String dataNascimento = JOptionPane.showInputDialog("Data do nascimento?");
			String rg  = JOptionPane.showInputDialog("Registro Geral?");
			String cpf  = JOptionPane.showInputDialog("Qual é o CPF");
			String nomeMae  = JOptionPane.showInputDialog("Nome da mãe");
			String nomePai  = JOptionPane.showInputDialog("Nome do Pai");
			String data  = JOptionPane.showInputDialog("Data da Matricula");
			String serie  = JOptionPane.showInputDialog("Serie Matriculada");
			String escola  = JOptionPane.showInputDialog("Nome da Escola");*/

			
			Aluno aluno1 = new Aluno(); 
			
			aluno1.setNome(nome);
		/*	aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(data);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola);*/
			
			for (int pos = 1; pos <= 1; pos++) {
				
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina ? ");
			
			if(escolha == 0 ) { /*Opcao Sim é Zero*/
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina ? 1, 2, 3, ou 4 ?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null,"Continuar a remover?");
				}
				
			}

			alunos.add(aluno1);
	}
			
		 maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		 maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		 maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		 
		 for (Aluno aluno : alunos) { /* Separei em Listas */
			 
			 if(aluno.getAlunoAprovado2() .equalsIgnoreCase(StatusAluno.APROVADO)) {
				 maps.get(StatusAluno.APROVADO).add(aluno);
			 }else
				 if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					 maps.get(StatusAluno.RECUPERACAO).add(aluno);
				 }else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
					 maps.get(StatusAluno.REPROVADO).add(aluno);
				 }
		 }
		 
		 
		 System.out.println("---------------------Lista dos aprovados---------------------------;");
		 for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			 System.out.println("Resultado = "+" Aluno ="+aluno.getNome() + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		 }
		 
		 System.out.println("---------------------Lista dos Reprovados---------------------------;");
		 for (Aluno aluno :  maps.get(StatusAluno.REPROVADO)) {
			 System.out.println("Resultado = "+" Aluno ="+aluno.getNome() + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		 }
		 
		 System.out.println("---------------------Lista dos Recuperação---------------------------;");
		 for (Aluno aluno :  maps.get(StatusAluno.RECUPERACAO)) {
			 System.out.println("Resultado = "+" Aluno ="+aluno.getNome() + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		 }
		 
		 
	

		
		
		
		
		
		}else {
			JOptionPane.showMessageDialog(null,"Acesso não permitido");
			
		}
		
		
	}
}
