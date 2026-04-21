package P2Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P2Q1Fraction implements P2Q1FractionInterface {

    private int numerator = 0;
    private int denominator = 0;

    public P2Q1Fraction() {
    }

    public P2Q1Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public P2Q1FractionInterface Addition(P2Q1FractionInterface fraction) {
        //a / b + c / d = (ad + bc) / bd
        P2Q1Fraction fractionAdd = new P2Q1Fraction();
        fractionAdd.setNumerator(this.numerator * fraction.getDenominator() + this.denominator * fraction.getNumerator());
        fractionAdd.setDenominator(this.denominator * fraction.getDenominator());
        return fractionAdd;
    }

    public P2Q1FractionInterface Subtraction(P2Q1FractionInterface fraction) {
        //a / b - c / d = (ad - bc) / bd
        P2Q1Fraction fractionSub = new P2Q1Fraction();
        fractionSub.setNumerator(this.numerator * fraction.getDenominator() - this.denominator * fraction.getNumerator());
        fractionSub.setDenominator(this.denominator * fraction.getDenominator());
        return fractionSub;
    }

    public P2Q1FractionInterface Multiplication(P2Q1FractionInterface fraction) {
        //a / b x c / d = ac / bd
        P2Q1Fraction fractionMul = new P2Q1Fraction();
        fractionMul.setNumerator(this.numerator * fraction.getNumerator() - this.denominator * fraction.getDenominator());
        fractionMul.setDenominator(this.denominator * fraction.getDenominator());
        return fractionMul;
    }

    public P2Q1FractionInterface Division(P2Q1FractionInterface fraction) {
        //(a / b) / (c / d) = ad / bc, where c / d ≠ 0

        P2Q1Fraction fractionDiv = new P2Q1Fraction();
        fractionDiv.setNumerator(this.numerator * fraction.getDenominator());
        fractionDiv.setDenominator(this.denominator * fraction.getNumerator());
        return fractionDiv;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public P2Q1FractionInterface SimplifyFraction() {
        int number = P2Q1Fraction.gcd(numerator, denominator);
        this.numerator = this.numerator / number;
        this.denominator = this.denominator / number;
        return new P2Q1Fraction(this.numerator, this.denominator);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

}
