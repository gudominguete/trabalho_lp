package models;

import java.util.ArrayList;
import java.util.List;

import enums.TipoCobranca;
import enums.TipoUsuario;
import models.pagavel.Aluguel;
import models.pagavel.IPagavel;

public class Imobiliaria extends Usuario {

    private String cnpj;
    private List<Imovel> imoveis;
    private List<Contrato> contratos;

    /**
     * Construtor do objeto
     * @param nome
     * @param login
     * @param senha
     */
    public Imobiliaria(String nome, String login, String senha) {
        super(nome, login, senha);
        this.tipo = TipoUsuario.IMOBILIARIA;
        this.imoveis = new ArrayList<Imovel>();
        this.contratos = new ArrayList<Contrato>();
    }

    @Override
    public String toString(){
        return this.getNome() + " - " + this.cnpj;
    }

    /**
     * Método para retornar o CNPJ do objeto
     * @return
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Método para alterar o CNPJ do objeto
     * @param cnpj
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Método para buscar a lista de imoveis do objeto
     * @return
     */
    public List<Imovel> getImoveis() {
        return imoveis;
    }

    /**
     * Método para inserir um imovel na imobiliaria
     * @param imovel
     */
    public void inserirImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }

    /**
     * Método para remover um imovel da imobiliaria
     * @param idImovel
     * @return
     */
    public Imovel removerImovel(Integer idImovel){

        for(int cont =0; cont < this.imoveis.size(); cont++){

            if(imoveis.get(cont).getId().equals(idImovel)){
                return this.imoveis.remove(cont);
            }

        }

        return null;

    }
    
    public void gerarCobranca(TipoCobranca tipoCobranca, Contrato contrato, double valor) {

    	IPagavel cobranca = null;

    	if(tipoCobranca.equals(TipoCobranca.ALUGUEL)) {
    		cobranca = new Aluguel(contrato, valor);
    	}else if(tipoCobranca.equals(TipoCobranca.MANUTENCAO)) {
    		cobranca = new Aluguel(contrato, valor);
    	}
    	
    	if(cobranca != null){
    		contrato.adicionarCobranca(cobranca);
    	}

    }
    
    private Contrato getContratoPorId(int idContrato){

    	for (Contrato contrato : contratos) {

    		if(contrato.getId() == idContrato){
    			return contrato;
    		}
    		
		}
    	
    	return null;
    	
    }
    
    public List<IPagavel> listarCobrancasPorIdContrato(int idContrato) {
    	
    	Contrato contrato = getContratoPorId(idContrato);
    	
    	if(contrato != null){
    		return contrato.getCobrancas();
    	}
    	
    	return null;
    	
    }



}
