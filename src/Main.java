import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account nam = new Account(1, "Nam", 1000);
        Account duc = new Account(2, "Duc", 500);
        displayBalance(nam);
        displayBalance(duc);
        System.out.println();

        //Nạp tiền vào tài khoản Đức
        System.out.println("Nạp 500 vào tài khoản Đức");
        duc.credit(500);
        displayBalance(duc);
        System.out.println();

        //Trừ tiền tài khoản Nam
        System.out.println("Trừ 250 vào tài khoản Nam");
        nam.debit(250);
        displayBalance(nam);
        System.out.println();

        //Trừ quá số tiền trong tài khoản
        System.out.println("Trừ 500 vào tài khoản Nam");
        nam.debit(500);
        displayBalance(nam);
        System.out.println();

        //Chuyển tiền hợp lệ
        System.out.println("Đức chuyển cho Nam 500");
        duc.transferTo(nam,500);
        displayBalance(duc);
        displayBalance(nam);
        System.out.println();

        //Chuyển tiền không hợp lệ
        System.out.println("Nam chuyển cho Đức 2000");
        nam.transferTo(duc,2000);
        displayBalance(nam);
        displayBalance(duc);
    }

    public static void displayBalance(Account account) {
        System.out.printf("Tài khoản của %s là: %d$", account.getName(), account.getBalance());
        System.out.println();
    }
}
