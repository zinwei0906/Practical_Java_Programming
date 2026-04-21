package P2Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface P2Q1FractionInterface {

    void setNumerator(int numerator);

    void setDenominator(int denominator);

    int getNumerator();

    int getDenominator();

    P2Q1FractionInterface Addition(P2Q1FractionInterface fraction);

    P2Q1FractionInterface Subtraction(P2Q1FractionInterface fraction);

    P2Q1FractionInterface Multiplication(P2Q1FractionInterface fraction);

    P2Q1FractionInterface Division(P2Q1FractionInterface fraction);

    P2Q1FractionInterface SimplifyFraction();

    String toString();

}
