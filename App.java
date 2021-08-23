import java.util.Scanner;

public class App{

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        CatalogoVeiculos c = new CatalogoVeiculos();
        c.carregaCatalogo();

        int command = 5;

        while(command != 0){
            System.out.println("Digite  0 para encerrar");
            System.out.println("Digite  1 para consultar veiculo por placa");
            System.out.println("Digite  2 para consultar veiculo por marca");
            System.out.println("Digite  3 para consultar veiculo por ano");
            System.out.println("Digite  4 para consultar veiculo por tipo");

            command = in.nextInt();

            switch (command){
                case 0 :
                    System.out.println("Encerrando o programa.");
                    break;
                case 1 :
                    System.out.println("Digite a placa: ");
                    String placa = in.next();
                    System.out.println(c.consultaPorPlaca(placa));
                    break;
                case 2 :
                    System.out.println("Digite a marca: ");
                    String marca = in.next();
                    System.out.println(c.consultaPorMarca(marca));
                    break;
                case 3 :
                    System.out.println("Digite o ano: ");
                    int ano = in.nextInt();
                    System.out.println(c.consultaPorAno(ano));
                    break;
                case 4 :
                    System.out.println("Digite o tipo: ");
                    String tipo = in.next();
                    System.out.println(c.consultaPorTipo(tipo));
                    break;
                default:
                    System.out.println("Voce digitou uma entrada invalida. Digite novamente.");
            }
        }
    }
}
