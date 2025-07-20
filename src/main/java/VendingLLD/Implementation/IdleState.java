package VendingLLD.Implementation;

import VendingLLD.Product;
import VendingLLD.State;
import VendingLLD.VendingMachine;

public class IdleState implements State
{
    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception
    {
        throw new Exception("Idle State cannot choose products");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin)
    {

    }

    @Override
    public Product dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("The state is Idle, cannot dispense product");
    }

    @Override
    public List<Coin> getFullRefund(VendingMachine vendingMachine) throws Exception{
        throw new Exception("The state is Idle,cannot get refund currently");
    }
}
