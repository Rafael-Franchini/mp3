public class DVD extends Musica {
    private final String interprete;
    public DVD(String nome, String Compositor, String tipo, int ano,String interprete) {
        super(nome, Compositor, tipo, ano);
        this.interprete=interprete;
    }
    public String getInterprete(){
        return this.interprete;
    }

    @Override
    public void Imprime(){
        System.out.print("Nome = "+this.getNome()+"\nCompositor = "+this.getCompositor()+"\nTipo = "+this.getTipo()+"\n ano = "+this.getAno()+"\nInterprete = "+this.getInterprete());
    }
    @Override
    public void tocar(){
        System.out.print("Reproduzindo um DVD");
    }
}
