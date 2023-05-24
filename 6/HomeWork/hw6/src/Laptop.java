public class Laptop {
    private String model;
    private int price;
    private int cores;
    private String colour;
    private double diagonal;
    private int RAM;
    private int batteryLife;

    public Laptop(String model, int price, int cores, String colour, double diagonal, int RAM, int batteryLife) {
        this.model = model;
        this.price = price;
        this.cores = cores;
        this.colour = colour;
        this.diagonal = diagonal;
        this.RAM = RAM;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Модель: "+ model+ ";\n" + "Цена: "+ price+ ";\n"+"Кол-во ядер: "+ cores+ ";\n"+
                "Цвет: " + colour+";\n"+"Диагональ: "+ diagonal+";\n"+"Оперативная память: "+RAM+";\n"+
                "Время автономной работы: "+ batteryLife+";\n\n";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

}
