package VendingLLD;

public interface State
{
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber);
    public void insertCoin(VendingMachine vendingMachine,int coin);
    public Product dispenseProduct(VendingMachine vendingMachine,int codeNumber);
    public List<Coin>getFullRefund(VendingMachine vendingMachine);

}
