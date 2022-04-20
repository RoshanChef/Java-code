/*
Oprator :
Oprator Follows precedence rule Not Bodmass
      8           +         9        =    Result
   (Operand) (Operater) (Operand)

    Unary -- It's Need one operand  ~ ++ -- !
    Binary  --It's Need Two operand + - / *
    Ternary -- It's Need Three operand  (Condition) ? True st. : False sta.

  Arithmetic + - / * %
  Assignment  = , += etc.
  Comparition == <= >= < >
  Logical     && || !
  Bitwise     & | ! (inclusive OR) ^ (exclusive OR)
  Shift       >> Left shift value>>n
              <<  Right shift value<<n
              >>> unsigned righ shift and MSB is 0


 Boolean doesn't play with Arithmetic

Precedence And Associativity


 Precedence = priority
 Associativity = direction 
                    => used when two or more operator has a same Precedence.


  First check Precedence,After check Associativity of Operater.
          Ex..(+,-) has a less Precedence as compare to (*,/).Hence (*,/) evalute first.
        The operaters are applied and evalute based upon "Precedence"

 After check Precedence we check Associativity
   * Associativity
        It's tells the direction evalution of operator
     + - * /  L to R
    ++a , --b    R to L

boolean never play with Arithmetic

 */

public class a3_operator {
    public static void main(String[] args) {

      int a=10;
      int b=a++;

      int c=10+(23/2)*3;

        System.out.println("Value of A :"+a+"\nValue of B : "+b);
        System.out.println("The Value of c is : "+c);


    }
}
