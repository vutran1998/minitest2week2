package Bai2;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    public int quantity;

    public CrispyFlour(String id, String name, LocalDate manuFactoringDate, int quantity,int cost) {
        super(id, name, manuFactoringDate,cost);
        this.quantity = quantity;
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manuFactoringDate.plusMonths(12) ;
    }
    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
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
        if(expiryDate.minusMonths(10).isBefore(now)){
            return this.getCost()*0.6;
        }else if(expiryDate.minusMonths(8).isBefore(now)){
            return this.getCost()*  0.8;
        }else {
            return this.getCost()*0.95;
        }
    }
}
