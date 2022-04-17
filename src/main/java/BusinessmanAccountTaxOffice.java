public class BusinessmanAccountTaxOffice {
    private double income;
    private double expenses;

    public BusinessmanAccountTaxOffice(double income, double expenses) {
        if(income < 0){
            this.income = 0;
        } else{
            this.income = income;
        }
        if (expenses < 0) {
            this.expenses = 0;
        } else {
            this.expenses = expenses;
        }
    }

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void increaseIncome(double value){
        if((income + value) < 0){
            income = 0;
        } else{
            income +=value;
        }
    }

    public void increaseExpenses(double value){
        if((expenses + value) < 0){
            expenses = 0;
        } else{
            expenses +=value;
        }
    }

    public double taxSixPercentIncome (){
        double tax = income * 0.06;
        return tax;
    }

    public double taxFifteenPercentIncomeMinusExpenses (){
        double tax = income - expenses;
        if (tax < 0){
            return 0;
        }
        return tax * 0.15;
    }

}
