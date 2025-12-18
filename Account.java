class Banking {
    double balance;
    Banking(double amount) {
        balance = amount;
    }
    double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Successfully withdrawn");
        }
        return balance;
    }
    double deposit(double amount) {
        balance = balance + amount;
        System.out.println("Successfully deposited");
        return balance;
    }
}

class Account {
    public static void main(String args[]) {
        Banking ba = new Banking(1000);
        ba.withdraw(5000);
        ba.deposit(200);
        System.out.println("Final Balance: " + ba.balance);
    }
}
