class CountryNotValidException extends Exception {
    public CountryNotValidException(String msg) {
        super(msg);
    }
}
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String msg) {
        super(msg);
    }
}
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String msg) {
        super(msg);
    }
}
class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        double taxAmount = 0;
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal > 50000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal > 30000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal > 10000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
        return taxAmount;
    }
}
class CalculatorSimulator {
    public static void main(String args[]) {
        TaxCalculator tc = new TaxCalculator();
        try {
            double tax = tc.calculateTax("Jack", true, 100000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}


