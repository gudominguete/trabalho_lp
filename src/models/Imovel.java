package models;

import models.pagavel.Aluguel;
import java.util.List;

/**
 * Created by gudominguete on 05/08/17.
 */
public class Imovel {

    private Integer id;
    private List<Aluguel> listaAluguel;
    private Endereco endereco;
    private Double valor;

    /**
     * Método para obter o valor do immóvel
     * @return
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Método para alterar o valor do imóvel
     * @param valor
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * Método para retornar o id de um imovel
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método para alterar um id de um imovel
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método para retornar o endereco de um imovel
     * @return
     */
	public Endereco getEndereco() {
		return endereco;
	}

    /**
     * Método para alterar o endereco de um imovel
     * @param endereco
     */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

    /**
     * Método para retornar a lista de aluguel de um imovel
     * @return
     */
    public List<Aluguel> getListaAluguel() {
        return listaAluguel;
    }

    /**
     * Método para alterar a lista de aluguel de um imovel
     * @param listaAluguel
     */
    public void setListaAluguel(List<Aluguel> listaAluguel) {
        this.listaAluguel = listaAluguel;
    }

    /**
     * Método para imprimir um tipo Imóvel
     * @return
     */
    @Override
    public String toString(){
        return id + endereco.toString();
    }
}
