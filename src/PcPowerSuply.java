public class PcPowerSuply {
    private String marca;
    private String model;
    private Double price;
    private Integer power;


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
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getPower() {
        return power;
    }
    public void GetPower(Integer power) {
        this.power = power;
    }
}
