package enums;

public enum TipoUsuario {

    IMOBILIARIA(0,"Imobiliaria","IMOBILIARIA"),
    LOCATARIO(1,"Locatario","LOCATARIO"),
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
