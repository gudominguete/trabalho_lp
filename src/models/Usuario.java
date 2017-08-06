package models;


import enums.TipoUsuario;

public class Usuario implements Autenticacao {

    private String nome;
    private String login;
    private String senha;
    private Boolean logado;
    private Integer id;

    /**
     * Construtor com nome, login e senha. O Id deve ser gerado ao cadastrar no banco.
     * @param nome
     * @param login
     * @param senha
     */
    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.logado = false;
    }

    /**
     * Função para retornar o nome do usuário
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Função para alterar o nome do usuário
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Função para acessar o login do usuário
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     * Função para alterar o login do usuário
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Função para verificar se o usuário está logado
     * @return
     */
    public Boolean getLogado() {
        return logado;
    }

    /**
     * Retorna o Id do usuário
     * @return
     */
    public Integer getId(){
        return id;
    }

    @Override
    public void autenticacao(String login, String senha) {
        if(login.equals(this.login) && senha.equals(this.senha)){
            this.logado = true;
            System.out.println("Login realizado com sucesso!");
        }else{
            this.logado = false;
            System.out.println("Login ou senha não estão corretos!");
        }
    }

    @Override
    public String recuperarSenha() {
        return this.senha;
    }

    @Override
    public void trocarSenha(String senha) {
        this.senha = senha;
    }
;
    @Override
    public Usuario cadastrarUsuario(String nome, String login, String senha, TipoUsuario tipoUsuario) {

        Usuario usuario;

        if(tipoUsuario.codigo.equals(TipoUsuario.LOCATARIO.codigo)){

            Locatario locatario = new Locatario(nome, login, senha);
            usuario = locatario;
            //TODO: cadastrar no banco e gerar id

        }else if (tipoUsuario.codigo.equals(TipoUsuario.PROPRIETARIO.codigo)){

            Proprietario proprietario = new Proprietario(nome, login, senha);
            usuario = proprietario;
            //TODO:Cadastrar no banco e gerar id
        }else{

            Imobiliaria imobiliaria = new Imobiliaria(nome, login, senha);
            usuario = imobiliaria;
            //TODO: Cadastrar no banco e gerar id
        }
        return usuario;
    }
}
