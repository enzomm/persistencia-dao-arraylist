package br.com.proway.senior.escola.controller;

import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.model.ProvaDao;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaController {
	
	private ProvaDao provaDao;
	private Prova prova;
	private ArrayListPersistenceProva dbProvas = new ArrayListPersistenceProva();
	
	public ProvaController(Prova prova) {
		this.provaDao = new ProvaDao(dbProvas);		
		this.prova = prova;
	}
	
	public ProvaController(int index) {
		this.provaDao = new ProvaDao(dbProvas);		
		
		this.prova = this.provaDao.get(index) ;
	}
	
		public void addProva() {		
		this.provaDao.add(this.prova);		
	}

	public void removeProva() {		
		this.provaDao.remove(this.prova.getId());		
	}
	
	public void get(Integer id) {		
		this.provaDao.get(id); 		
	}
	
}

