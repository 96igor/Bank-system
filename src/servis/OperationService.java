package servis;

public interface OperationService {

    void deposit(String cardNumber, Double amount);

    void withdraw(String cardNumber, Double amount);

    void transfer(String cardNumberFrome, String cardNumberTo, Double amount);
}
