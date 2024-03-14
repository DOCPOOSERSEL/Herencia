public class Comissions extends Employee {
    private double comissionRate;
    private double grossSales;

    public Comissions(String firstName, String lastName, String socialSecurityNumber, double comissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }
    public double getGrossSales() {
        return grossSales;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double calculateComissionPay(){
        return comissionRate* grossSales;
    }
}
