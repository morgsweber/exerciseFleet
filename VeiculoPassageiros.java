public class VeiculoPassageiros extends Veiculo{
	
    private int nroPass;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPass) {
        super(placa, marca, modelo, ano, valor);
        this.nroPass = nroPass;
    }

    public double getnroPass() {
        return nroPass;
    }

    public void setnroPass(int nroPass) {
        this.nroPass = nroPass;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Numero de Passageiros: " + nroPass() "\n";
    }
}