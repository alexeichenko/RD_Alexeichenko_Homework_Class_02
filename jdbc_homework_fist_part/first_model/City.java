package jdbc_homework_fist_part.first_model;

import java.util.Objects;

public class City {
    private int id;
    private String name;
    private String towards;
    private int population;
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTowards() {
        return towards;
    }

    public void setTowards(String towards) {
        this.towards = towards;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id && population == city.population && Objects.equals(name, city.name) && Objects.equals(towards, city.towards) && Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, towards, population, country);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", towards='" + towards + '\'' +
                ", population=" + population +
                ", country=" + country +
                '}';
    }
}
