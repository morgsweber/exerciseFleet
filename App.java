import java.util.Scanner;

public class App{

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        CatalogoVeiculos c = new CatalogoVeiculos();
        c.carregaCatalogo();

        System.out.println("Digite  1 para consultar veiculo por placa");
        System.out.println("Digite  2 para consultar veiculo por marca");
        System.out.println("Digite  3 para consultar veiculo por ano");
        System.out.println("Digite  4 para consultar veiculo por tipo");

        int command = in.nextInt();

        if(command == 1){
            System.out.println("Digite a placa: ");
            String placa = in.next();
            System.out.println(c.consultaPorPlaca(placa));
        }else if(command == 2){
            System.out.println("Digite a marca: ");
            String marca = in.next();
            System.out.println(c.consultaPorMarca(marca));
        }else if(command == 3){
            System.out.println("Digite o ano: ");
            int ano = in.nextInt();
            System.out.println(c.consultaPorAno(ano));
        }else if(command == 4){
            System.out.println("Digite o tipo: ");
            String tipo = in.next();
            System.out.println(c.consultaPorTipo(tipo));
        }
    }

}