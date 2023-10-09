public class PcMotherboar {
    private String marca;
    private String model;
    private Double price;
    private String socket;

    public String getPcFull() {
        return model + " " + model + " " + price;
    }
    public String getMarca() {
        return model;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String modelo) {
        this.model = model;
    }
    public Double getPrecio() {
        return price;
    }
    public void setPrice(Double precio) {this.price = price;}
    public String getSocket() {
        return socket;
    }
    public void setSocket(String socket) {
        this.socket = socket;
    }
}
