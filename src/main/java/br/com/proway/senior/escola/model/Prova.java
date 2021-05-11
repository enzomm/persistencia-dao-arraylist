package br.com.proway.senior.escola.model;

public class Prova {

	private Integer id;
	private Integer periodo;
	private Aluno aluno;
	private Materia materia;
	private Double nota = 0.0;
	private int peso = 1; 
		
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
		
	public Double getNota() {
		return nota;
	}
	
	public void setNota(Double nota) throws Exception {
		if(nota < 0 || nota > this.materia.notaMaxima) {
			throw new Exception("Valor da nota inválido.");
		}
		this.nota = nota;
	}	
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Integer getPeriodo() {
		return periodo;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Materia getMateria() {
		return materia;
	}
		
}
