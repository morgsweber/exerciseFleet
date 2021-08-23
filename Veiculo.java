public abstract class Veiculo{

    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valor;

    protected Veiculo(String placa, String marca, String modelo, int ano, double valor){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }



    //metodos getters
    public String getPlaca(){ return placa;}
    public String getMarca(){ return marca;}
    public String getModelo(){ return modelo;}
    public int getAno(){ return ano;}
    public double getValor(){ return valor;}

    //metodos setters
    public void setPlaca(String nova_placa){
        this.placa = nova_placa;
    }
    public void setMarca(String nova_marca){
        this.marca = nova_marca;
    }
    public void setModelo(String novo_modelo){
        this.modelo = novo_modelo;
    }
    public void setAno(int novo_ano){
        this.ano = novo_ano;
    }
    public void setValor(double novo_valor){
        this.valor = novo_valor;
    }

    public String toString(){
        return "\nPlaca: " + getPlaca() + "\n" +
        "Marca: " + getMarca() + "\n" +
        "Modelo: " + getModelo() + "\n" +
        "Ano: " + getAno() + "\n" + 
        "Valor: " + getValor() + "\n" ;
    }

}