public abstract class Musica {
    private final String nome;
    final String Compositor;
    private final String tipo;
    private final int ano;
    public Musica(String nome,String Compositor,String tipo,int ano){
        this.nome=nome;
        this.Compositor =Compositor;
        this.tipo=tipo;
        this.ano=ano;
    }

    public String getNome(){
        return this.nome;
    };
    public String getCompositor(){
        return this.Compositor;
    };
    public String getTipo(){
        return this.tipo;
    };
    public int getAno(){
      return  this.ano;
    }
    public abstract void Imprime();

    public abstract void tocar();
}
