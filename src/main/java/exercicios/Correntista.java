package exercicios;

public class Correntista {
    private String codigo;
    private String nome;
    private String email;
    private String telefone;

    public Correntista(String codigo, String nome,String email,String telefone){
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.length()<4) {
            throw new IllegalArgumentException("Codigo Invalido.");
        }
        else this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length()<2) {
            throw new IllegalArgumentException("Nome Invalido.");
        }
        else this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length()<7) {
            throw new IllegalArgumentException("Email Invalido.");
        }
        else this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length()<8) {
            throw new IllegalArgumentException("Telefone Invalido.");
        }
        else this.telefone = telefone;
    }
}

