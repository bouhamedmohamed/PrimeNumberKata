package domain;

public class PermierNumber {
    public boolean isPremier(int number) {
        if ( number <= 0 )
            throw new NumberPremierException ( );
        if ( number == 1 )
            return true;
        else
            for (int i = 2; i <= Math.sqrt (number); i++) {
                if ( number % i == 0 )
                    return false;

            }
        return true;
    }

    public int biggestPrimeNumber() {
        for (int number = 999; number > 1; number--) {
            if ( isPremier (number) )
                return number;

        }
        return 1;
    }

}
