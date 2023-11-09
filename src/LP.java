public class LP extends Musica {
    private final int rpm;
    public LP(String nome, String Compositor, String tipo, int ano,int rpm) {
        super(nome, Compositor, tipo, ano);
        this.rpm=rpm;
    }
    public int getRpm(){
        return this.rpm;
    }

    @Override
    public void Imprime(){
        System.out.print("Nome = "+this.getNome()+"\nCompositor = "+this.getCompositor()+"\nTipo = "+this.getTipo()+"\n ano = "+this.getAno()+"\nRPM = "+this.getRpm());
    }
    @Override
    public void tocar(){
        System.out.print("Reproduzindo um LP");
    }
}
