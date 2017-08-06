package models;

import java.util.List;

public class Imobiliaria extends Usuario {

    private String cnpj;
    private List<Imovel> listaImoveis;

    /**
     * Construtor do objeto
     * @param nome
     * @param login
     * @param senha
     */
    public Imobiliaria(String nome, String login, String senha) {
        super(nome, login, senha);
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
    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    /**
     * Método para inserir um imovel na imobiliaria
     * @param imovel
     */
    public void inserirImovel(Imovel imovel){
        this.listaImoveis.add(imovel);
    }

    /**
     * Método para remover um imovel da imobiliaria
     * @param idImovel
     * @return
     */
    public Imovel removerImovel(Integer idImovel){

        Imovel imovelRemovido;

        for(int cont =0; cont < this.listaImoveis.size(); cont++){

            if(listaImoveis.get(cont).getId().equals(idImovel)){
                imovelRemovido = listaImoveis.get(cont);
                this.listaImoveis.remove(cont);
                return imovelRemovido;
            }
        }

        return null;
    }


}
