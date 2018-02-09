package br.com.cassiopaixao.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.LocalDateTime;

import br.com.cassiopaixao.model.Aluno;

/**
 * 
 * @author CassioPaixao
 *
 */

public class AlunoSync {

	private final List<Aluno> alunos;
	private final String momentoDaUltimaModificacao;

	public AlunoSync(List<Aluno> alunos) {
		this.alunos = alunos;
		this.momentoDaUltimaModificacao = LocalDateTime.now().toString();
	}

	public AlunoSync(Aluno aluno) {
		this.alunos = new ArrayList<>(Arrays.asList(aluno));
		this.momentoDaUltimaModificacao = LocalDateTime.now().toString();
	}

	public AlunoSync(List<Aluno> alunos, String datahora) {
		this.alunos = alunos;
		this.momentoDaUltimaModificacao = datahora;
	}

	public AlunoSync(Aluno aluno, String datahora) {
		this.alunos = new ArrayList<>(Arrays.asList(aluno));
		this.momentoDaUltimaModificacao = datahora;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public String getMomentoDaUltimaModificacao() {
		return momentoDaUltimaModificacao;
	}

}
