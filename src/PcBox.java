public class PcBox {

    private String marca;
    private String model;
    private Double price;
    private String type;

    public String getPcFull(){return marca + " " + model + " " + price;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getModel() {return model;}
    public void setModel(String modelo){this.model = modelo;}
    public Double getPrice(){return price;}
    public void setPrice(Double precio){this.price = price;}
    public String getType(){return type;}
    public void setType(String tipo){this.type = tipo;}
}
