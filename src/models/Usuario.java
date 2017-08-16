package models;


import enums.TipoUsuario;

public class Usuario implements Autenticacao {

    private String nome;
    private String login;
    private String senha;
    private Boolean logado;
    private Integer id;
    
    protected TipoUsuario tipo;

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
     * Método para imprimir um usuário
     * @return
     */
    @Override
    public String toString(){

        return nome + " - " + login;
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
     * Método para retornar a senha do usuário
     * @return
     */
    public String getSenha(){return senha;}

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

    /**
     * Método para realizar a autenticação do usuário no sistema
     * @param login
     * @param senha
     */
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

    /**
     * Método para obter a senha do usuário
     * @return
     */
    @Override
    public String recuperarSenha() {
        return this.senha;
    }

    /**
     * Método para realizar a troca de senha
     * @param senha
     */
    @Override
    public void trocarSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método para cadastrar um novo usuário
     * @param nome
     * @param login
     * @param senha
     * @param tipoUsuario
     * @return
     */
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
        	usuario = null;
        }
        return usuario;

    }

    /**
     * Retorna o tipo de usuario
     * @return
     */
	public TipoUsuario getTipo() {
		return tipo;
	}

}
