package primari;

public class Persona {

    private String nome;
    private String congome;
    private int eta;

    public Persona(String nome, String congome, int eta) {
        this.nome = nome;
        this.congome = congome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCongome() {
        return congome;
    }

    public void setCongome(String congome) {
        this.congome = congome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", congome='" + congome + '\'' +
                ", eta=" + eta +
                '}';
    }

    public int compare(Object obj)  {
        Persona p = (Persona)obj;
        return this.getNome().compareTo(p.getNome());
    }
}
