package Bai2;

import java.time.LocalDate;

public class Meat extends Material {
    public double weight;

    public Meat(String id, String name, LocalDate manuFactoringDate, double weight,int cost) {
        super(id, name, manuFactoringDate,cost);
        this.weight = weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return cost*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manuFactoringDate.plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manuFactoringDate=" + manuFactoringDate +
                ", cost=" + cost +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate expiryDate = this.getExpiryDate();
        LocalDate now = LocalDate.now();
        if (expiryDate.minusDays(2).isBefore(now)){
            return this.getCost() * 0.7;
        }else {
            return this.getCost() *  0.9;
        }
    }
}
