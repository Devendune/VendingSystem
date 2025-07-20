package VendingLLD;

public interface State
{
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception;
    public void insertCoin(VendingMachine vendingMachine,int coin) throws Exception;
    public Product dispenseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception;
    public List<Coin>getFullRefund(VendingMachine vendingMachine) throws Exception;

}
