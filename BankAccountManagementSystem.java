import java.util.*;

class BankAccountManagementSystem {
    private Map<Integer, BankAccount> accounts = new HashMap<>();

    private static class BankAccount {
        private int account_Number;
        private double balance;

        public BankAccount(int account_Number, double initial_Deposit) {
            this.account_Number = account_Number;
            this.balance = initial_Deposit;
        }

        public int get_Account_Number() {
            return account_Number;
        }

        public double get_Balance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }
    }

    public String create_account(int account_number, double initial_deposit) {
        if(accounts.containsKey(account_number)) {
            return "Account already exists.";
        }
        if(initial_deposit <= 0) {
            return "Initial deposit must be greater than zero.";
        }
        BankAccount newAccount = new BankAccount(account_number, initial_deposit);
        accounts.put(account_number, newAccount);
        newAccount.get_Account_Number();
        return "Account created successfully.";
    }

    public String deposit(int accountNumber, double amount) {

        BankAccount acc = accounts.get(accountNumber);
        if (acc == null) {
            return "Error: Account does not exist.";
        }

        if (amount <= 0) {
            return "Error: Deposit amount must be positive.";
        }

        acc.deposit(amount);
        return "Deposit successful. New balance: " + acc.get_Balance();
    }

    public String withdraw(int accountNumber, double amount) {

        BankAccount acc = accounts.get(accountNumber);
        if (acc == null) {
            return "Error: Account does not exist.";
        }

        if (amount <= 0) {
            return "Error: Withdrawal amount must be positive.";
        }

        if (amount > acc.get_Balance()) {
            return "Error: Insufficient funds.";
        }

        acc.withdraw(amount);
        return "Withdrawal successful. Remaining balance: " + acc.get_Balance();
    }

    public String check_balance(int account_number) {
        BankAccount account = accounts.get(account_number);
        if(account == null) {
            return "Account does not exist";
        }
        return "Current balance: " + account.get_Balance();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountManagementSystem bank = new BankAccountManagementSystem();

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Account Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter initial balance: ");
                    double initialBal = sc.nextDouble();
                    System.out.println(bank.create_account(accNo, initialBal));
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int dAccNo = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double damt = sc.nextDouble();
                    System.out.println(bank.deposit(dAccNo, damt));
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int wAccNo = sc.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double wamt = sc.nextDouble();
                    System.out.println(bank.withdraw(wAccNo, wamt));
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int bAccNo = sc.nextInt();
                    System.out.println(bank.check_balance(bAccNo));
                    break;

                case 5:
                    System.out.println("Thank you! Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
}
