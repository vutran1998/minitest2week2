package Bai2;

import java.time.LocalDate;

public abstract class Material implements Discount {
    public String id;
    public String name;
    public LocalDate manuFactoringDate;
    public int cost;

    public Material(String id, String name, LocalDate manuFactoringDate,int cost) {
        this.id = id;
        this.name = name;
        this.manuFactoringDate = manuFactoringDate;
        this.cost=cost;
    }

    public Material() {
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManuFactoringDate() {
        return manuFactoringDate;
    }

    public void setManuFactoringDate(LocalDate manuFactoringDate) {
        this.manuFactoringDate = manuFactoringDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manuFactoringDate=" + manuFactoringDate +
                ", cost=" + cost +
                '}';
    }
}
