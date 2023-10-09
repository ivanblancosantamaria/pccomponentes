public class PcPrimaryDisk {
    private String marca;
    private String model;
    private Double price;
    private Integer tamaño;

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
    public Double GetPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getTamaño() {
        return tamaño;
    }
    public void getTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }
}
