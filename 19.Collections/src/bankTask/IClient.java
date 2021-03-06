package bankTask;

public interface IClient {

	void makeDeposit(double money, Deposit deposit) throws FaliralaBankaException;

	void getCredit(double money, Credit credit) throws FaliralaBankaException;

	void payBankInterest() throws FaliralaBankaException;
}
