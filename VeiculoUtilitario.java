public class VeiculoUtilitario extends Veiculo{

    protected int capCargaTon;

    protected VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon) {
        super(placa, marca, modelo, ano, valor);
        this.capCargaTon =capCargaTon;
    }

    public int getCapCargaTon() {
        return capCargaTon;
    }

    public void setCapCargaTon(int capCargaTon) {
        this.capCargaTon = capCargaTon;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Carga: " + getCapCargaTon() + "\n";
    }
}
