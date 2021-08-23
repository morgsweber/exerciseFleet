import java.util.ArrayList;

public class CatalogoVeiculos {

    private ArrayList<Veiculo> veiculos;
    private ArrayList<Veiculo> resultado;

    public CatalogoVeiculos(){
        veiculos = new ArrayList<>(100);
        resultado = new ArrayList<>(100);
    }

    public Veiculo consultaPorPlaca(String placa){
        for(Veiculo veiculo:veiculos){
            if (veiculo.getPlaca().equals(placa)){
                return veiculo;
            }
        }
        return null;
    }

    public ArrayList<Veiculo> consultaPorMarca(String marca){

        for(Veiculo veiculo:veiculos){
            if (veiculo.getMarca().equals(marca)){
                resultado.add(veiculo);
            }
        }
        return resultado;
    }

    public ArrayList<Veiculo> consultaPorAno(int ano){

        for(Veiculo veiculo:veiculos){
            if (veiculo.getAno() == ano){
                resultado.add(veiculo);
            }
        }
        return resultado;
    }

    public ArrayList<Veiculo> consultaPorTipo(String tipo){
        if(tipo.equals("utilitario")){

        }else if(tipo.equals("passeio")){

        }else if(tipo.equals("passageiros")){

        }
        return resultado;
    }

    public void carregaCatalogo(){
        veiculos.add(new VeiculoPasseio("jok9092", "fiat", "uno", 2008, 8000, 20));
        veiculos.add(new VeiculoPassageiros("abc9034", "renault", "sandero", 2009, 9000, 40));
        veiculos.add(new VeiculoUtilitario("rtj4550", "bmw", "sedan", 2020, 180000, 5, 2));
    }
}
