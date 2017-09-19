import domain.NumberPremierException;
import domain.PermierNumber;
import org.junit.Assert;
import org.junit.Test;

public class PremierNumberTest {
    @Test
    public void should_return_true_in_of_one() {
        final PermierNumber permierNumber = new PermierNumber ( );
        Assert.assertEquals (true, permierNumber.isPremier (1));
    }

    @Test
    public void should_return_false_in_of_four() {
        final PermierNumber permierNumber = new PermierNumber ( );
        Assert.assertEquals (false, permierNumber.isPremier (4));
    }

    @Test
    public void should_return_true_in_of_three() {
        final PermierNumber permierNumber = new PermierNumber ( );
        Assert.assertEquals (true, permierNumber.isPremier (3));
    }

    @Test(expected = NumberPremierException.class)
    public void should_raise_an_exception_when_negative_number() {
        final PermierNumber permierNumber = new PermierNumber ( );
        permierNumber.isPremier (-1);
    }

    @Test
    public void should_biggest_prime_number_with_three_numbers() {
        final PermierNumber permierNumber = new PermierNumber ( );
        int biggestnumber = permierNumber.biggestPrimeNumber ( );
        Assert.assertEquals (997, biggestnumber);
    }


}
