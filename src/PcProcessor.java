public class PcProcessor {
    private String marca;
    private String model;
    private Double price;

    public String getPcFull() {
        return marca + " " + model + " " + price;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double precio) {
        this.price = precio;
    }
}
