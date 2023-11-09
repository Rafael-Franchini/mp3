import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println(" 1. adicionar músicas.\n" +
                "2. remover uma música através do título.\n" +
                "3. realizar busca por músicas através do ano, exiba a relação na tela.\n" +
                "4. realizar busca por músicas através do compositor.\n" +
                "5. encerrar o programa.\n");
    }
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        boolean teste = true;
        ArrayList<Musica> musicList = new ArrayList<>();
        System.out.println("Menu de ações:\n");
        while(teste){
            menu();
            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("1. adicionar MP3.\n" +
                    "2. Adicionar CD.\n" +
                    "3. Adicionar LP.\n" );
                    int op = scanner.nextInt();
                    System.out.print("Digite o título da música: ");
                    String titulo = scanner.next();
                    System.out.print("Digite o ano da música: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite o compositor da música: ");
                    String compositor = scanner.next();
                    if(op==1){
                        System.out.print("Digite o tamanho da música: ");
                        int tamanho = scanner.nextInt();
                        MP3 mp3= new MP3(titulo,compositor,"MP3",ano,tamanho);
                        musicList.add(mp3);
                    } else if(op==2){
                        System.out.print("Digite o interprete: ");
                        String interprete = scanner.next();
                        DVD dvd= new DVD(titulo,compositor,"DVD",ano,interprete);
                        musicList.add(dvd);
                    } else if(op==3){
                        System.out.print("Digite o RPM: ");
                        int rpm = scanner.nextInt();
                        LP lp= new LP(titulo,compositor,"LP",ano,rpm);
                        musicList.add(lp);
                    }
                    break;
                case 2:
                    System.out.print("Digite o título da música: ");
                    String titulo2 = scanner.next();
                    for (Musica musica : musicList) {
                        if (musica.getNome().equals(titulo2)) {
                            musicList.remove(musica);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o ano da música: ");
                    int ano2 = scanner.nextInt();
                    for (Musica musica : musicList) {
                        if (musica.getAno()==ano2) {
                            musica.Imprime();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o compositor da música: ");
                    String compositor2 = scanner.next();
                    for (Musica musica : musicList) {
                        if (musica.getCompositor().equals(compositor2)) {
                            musica.Imprime();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Programa encerrado!");
                    teste = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
        }
    }}catch (java.util.InputMismatchException e){
            System.out.println("Erro: Entrada inválida!!!! tente novamente!");
        }catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }
}