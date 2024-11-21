import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class BankAccount {
    private String AccountNumber;
    private BigDecimal balance;
    private String owner;
    private String ContactNumber;
    private String NameBank;
    private String bonus;


    // Конструктор
    public BankAccount(String AccountNumber, BigDecimal balance, String owner, String ContactNumber, String NameBank, String bonus) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.owner = owner;
        this.ContactNumber = ContactNumber;
        this.NameBank = NameBank;
        this.bonus = bonus;
    }

    // Геттры сеттры
    public String getAccountNumber() {
        return AccountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public String getNameBank() {
        return NameBank;
    }

    public String getBonus() {
        return bonus;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public void setNameBank(String NameBank) {
        this.NameBank = NameBank;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
	//Метод депозита
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
	//Метод снятия денег с счета
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
	//Метод показа баланса
    public BigDecimal showBalanse() {
        return balance;
    }






    public static void main(String[] args) {

BankAccount nastaya = new BankAccount("15478563214890", new BigDecimal("1448.2222222222"), "Настя", "254866952135", "ВТБ банк", "Кредиты с низкими процентами ");
	//Проверяем баланс
        System.out.println(nastaya.showBalanse());
	//Ложим на счет 1000
        nastaya.deposit(valueOf(1000.99));
	//Проверяем баланс
        System.out.println(nastaya.showBalanse());
	//Снимаем с счета 1000
        nastaya.withdraw(valueOf(1000.99));
	//Проверяем баланс
        System.out.println(nastaya.showBalanse());
	//Создаем переменную для удобного отображения
        BigDecimal n = nastaya.getBalance();
	//Округление в большую сторону
        System.out.println(n.setScale(3, BigDecimal.ROUND_CEILING));
	//Отбрасование разрядов
        System.out.println(n.setScale(3, BigDecimal.ROUND_DOWN));
	//Округление в меньшию сторону
        System.out.println(n.setScale(3, BigDecimal.ROUND_FLOOR));
	//округление в большую сторону, если число после запятой >= .5
        System.out.println(n.setScale(1, BigDecimal.ROUND_HALF_UP));

    }
}
