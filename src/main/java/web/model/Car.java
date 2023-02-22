package web.model;

public class Car {              //2. Создайте модель Car с тремя произвольными полями.
    private String model;
    private String series;
    private int year;
    private int id;


    public Car(String model, String series, int year, int id) {
        this.model = model;
        this.series = series;
        this.year = year;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", series='" + series + '\'' + ", year=" + year + '}';
    }
}
