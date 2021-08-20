public class Veiculo{

    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(){
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