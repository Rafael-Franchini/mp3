public class MP3 extends Musica {
    private final int tamanho;

    public MP3(String nome, String Compositor, String tipo, int ano,int tamanho) {
        super(nome, Compositor, tipo, ano);
        this.tamanho=tamanho;
    }

    public int getTamanho(){
        return this.tamanho;
    };

    @Override
    public void Imprime(){
        System.out.print("Nome = "+this.getNome()+"\nCompositor = "+this.getCompositor()+"\nTipo = "+this.getTipo()+"\n ano = "+this.getAno()+"\nTamanho = "+this.getTamanho());
    }
    @Override
    public void tocar(){
        System.out.print("Reproduzindo um MP3");
    }
}
