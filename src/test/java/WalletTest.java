import com.codeclan.example.CreditCard;
import com.codeclan.example.DebitCard;
import com.codeclan.example.GiftCard;
import com.codeclan.example.Wallet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    DebitCard debitCard;
    GiftCard giftCard;
    CreditCard creditCard;

    @Before
    public void before() {
        wallet = new Wallet();
        debitCard = new DebitCard("1234 4321 0987 7890", "08/26", 874, "82343325", "80-45-32");
        creditCard = new CreditCard("0987 7890 1234 4321", "10/26", 034, 6500);
        giftCard = new GiftCard(500);
        wallet.addCard(debitCard);
        wallet.addCard(creditCard);
        wallet.addCard(giftCard);
    }

    @Test
    public void hasCards() {
        assertEquals(3, wallet.countCards());
    }

    @Test
    public void canAddCard() {
        GiftCard giftCard1 = new GiftCard(400);
        wallet.addCard(giftCard1);
        assertEquals(4, wallet.countCards());
    }

    @Test
    public void canChooseCard() {
        assertEquals(creditCard, wallet.chooseCard(creditCard));
    }

    @Test
    public void canPayWithGiftCard() {
        wallet.charge(giftCard, 50.45);
        assertEquals(449.55, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canPayWithDebitCard() {
        wallet.charge(debitCard, 90.45);
        wallet.charge(debitCard, 100);
        assertEquals(2, debitCard.getTransactions().size());
    }

    @Test
    public void canPayWithCreditCard() {
        wallet.charge(creditCard, 90.45);
        wallet.charge(creditCard, 100);
        assertEquals(2, creditCard.getTransactions().size());
        assertEquals(6309.55, creditCard.getCredit(), 0.0);
    }
}
