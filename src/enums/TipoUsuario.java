package enums;

public enum TipoUsuario {

    IMOBILIARIA(0,"Imobiliaria","IMOBILIARIA"),
    PESSOA(1,"Pessoa","PESSOA"),
    PROPRIETARIO(2,"Proprietario","PROPRIETARIO");

    public int id;
    public String descricao;
    public String codigo;

    TipoUsuario(int id, String descricao, String codigo){
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
    }



}
