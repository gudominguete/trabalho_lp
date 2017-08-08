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
}
