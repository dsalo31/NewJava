public class BankAccount {
    BankAccount(){

    }
   int id;
   String name;
   double balance;

   double popolnenieSheta(double pop){
        balance += pop;
       return balance;

   } double snyatieSoSheta(double pop){
        balance -= pop;
       return balance;
   }
   void showInfo(){
       System.out.println("Номер Аккаунта: " + id + " Имя: " + name + " Баланс: " + balance);
   }
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount den = new BankAccount();
        den.id = 235;
        den.name = "Denys";
        den.balance = 1560;
        den.popolnenieSheta(1000);
        den.showInfo();
        den.snyatieSoSheta(500);
        den.showInfo();
    }
}
