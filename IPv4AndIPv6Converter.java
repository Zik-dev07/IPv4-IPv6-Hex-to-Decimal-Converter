import java.util.Scanner;

public class IPv4AndIPv6Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select either 1 converter (IPv4 or IPv6):");
        System.out.println("1. IPv4 converter from hexadecimal to decimal");
        System.out.println("2. IPv6 converter from hexadecimal to decimal");
        System.out.print("Enter your option (1-2): ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                for (; ; ) {
                    //Hexabase 16 is implemented here
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Hexadecimal base 16 and exponentiation is already implemented");
                    int hexabase = 16;


                    //1st octet
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("1st octets");

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput = input.next();
                    int hexnum = Integer.parseInt(hexInput, 16);

                    //Exponentiation (^1) is implemented here
                    int result = (int) Math.pow(hexabase, 1) * hexnum;

                    System.out.println("The result is " + result);
                    int hexabase1 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput1 = input.next();
                    int hexnum1 = Integer.parseInt(hexInput1, 16);
                    //Exponentiation (^0) is implemented here
                    int result1 = (int) Math.pow(hexabase, 0) * hexnum1;

                    System.out.println("The result is " + result1);
                    int sum = result + result1;


                    //2nd octet
                    System.out.println("---------------------------------------------");
                    System.out.println("2nd octets");
                    int hexabase2 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput2 = input.next();
                    int hexnum2 = Integer.parseInt(hexInput2, 16);
                    //Exponentiation (^1) is implemented here
                    int result2 = (int) Math.pow(hexabase2, 1) * hexnum2;

                    System.out.println("The result is " + result2);
                    int hexabase3 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput3 = input.next();
                    int hexnum3 = Integer.parseInt(hexInput3, 16);
                    //Exponentiation (^0) is implemented here
                    int result3 = (int) Math.pow(hexabase3, 0) * hexnum3;

                    System.out.println("The result is " + result3);
                    int sum1 = result2 + result3;


                    //3rd octet
                    System.out.println("---------------------------------------------");
                    System.out.println("3rd octets");
                    int hexabase4 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput4 = input.next();
                    int hexnum4 = Integer.parseInt(hexInput4, 16);
                    //Exponentiation (^1) is implemented here
                    int result4 = (int) Math.pow(hexabase4, 1) * hexnum4;

                    System.out.println("The result is " + result4);
                    int hexabase5 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput5 = input.next();
                    int hexnum5 = Integer.parseInt(hexInput5, 16);
                    //Exponentiation (^0) is implemented here
                    int result5 = (int) Math.pow(hexabase5, 0) * hexnum5;

                    System.out.println("The result is " + result5);
                    int sum2 = result4 + result5;


                    //4th octet
                    System.out.println("---------------------------------------------");
                    System.out.println("4th octets");
                    int hexabase6 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput6 = input.next();
                    int hexnum6 = Integer.parseInt(hexInput6, 16);
                    //Exponentiation (^1) is implemented here
                    int result6 = (int) Math.pow(hexabase6, 1) * hexnum6;

                    System.out.println("The result is " + result6);
                    int hexabase7 = 16;

                    System.out.print("Enter hexadecimal number: ");
                    String hexInput7 = input.next();
                    int hexnum7 = Integer.parseInt(hexInput7, 16);
                    //Exponentiation (^0) is implemented here
                    int result7 = (int) Math.pow(hexabase7, 0) * hexnum7;

                    System.out.println("The result is " + result7);
                    int sum3 = result6 + result7;


                    //Display result in IP address format
                    System.out.println("-------------------------------------");
                    System.out.println("The converted IP address is " + sum + "." + sum1 + "." + sum2 + "." + sum3);
                    System.out.println("-------------------------------------");


                    System.out.print("Input any number to CONTINUE and 0 to END: ");
                    int end = input.nextInt();

                    if (end == 0) {
                        System.out.println("Program terminated.");
                        System.exit(0);
                    }
                }

            case 2:
                for (;;){
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Hexadecimal base 16 and exponentiation is already implemented");
                    int hexabase1 = 16;

                    //#1 group
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("1# group");

                    System.out.print("Enter first digit: ");
                    String digitInput=input.next();
                    int digit = Integer.parseInt(digitInput, 16);
                    int resultt = (int) Math.pow(hexabase1, 3) * digit;

                    System.out.print("Enter second digit: ");
                    String digitInput1=input.next();
                    int digit1 = Integer.parseInt(digitInput1, 16);
                    int resultt1 = (int) Math.pow(hexabase1, 2) * digit1;


                    System.out.print("Enter third digit: ");
                    String digitInput2=input.next();
                    int digit2 = Integer.parseInt(digitInput2, 16);
                    int resultt2 = (int) Math.pow(hexabase1, 1) * digit2;

                    System.out.print("Enter fourth digit: ");
                    String digitInput3 = input.next();
                    int digit3 = Integer.parseInt(digitInput3, 16);
                    int resultt3 = (int) Math.pow(hexabase1, 0) * digit3;

                    int summ = resultt+resultt1+resultt2+resultt3;
                    System.out.println("----------------------------------------");
                    System.out.println("The #1 group value is "+summ);
                    System.out.println("----------------------------------------");

                    //#2 group
                    System.out.println("2# group");

                    System.out.print("Enter first digit: ");
                    String digitInput4=input.next();
                    int digit4 = Integer.parseInt(digitInput4, 16);
                    int resultt4 = (int) Math.pow(hexabase1, 3) * digit4;

                    System.out.print("Enter second digit: ");
                    String digitInput5=input.next();
                    int digit5 = Integer.parseInt(digitInput5, 16);
                    int resultt5 = (int) Math.pow(hexabase1, 2) * digit5;


                    System.out.print("Enter third digit: ");
                    String digitInput6=input.next();
                    int digit6 = Integer.parseInt(digitInput6, 16);
                    int resultt6 = (int) Math.pow(hexabase1, 1) * digit6;

                    System.out.print("Enter fourth digit: ");
                    String digitInput7 = input.next();
                    int digit7 = Integer.parseInt(digitInput7, 16);
                    int resultt7 = (int) Math.pow(hexabase1, 0) * digit7;

                    int summ1 = resultt4 + resultt5 + resultt6 + resultt7;
                    System.out.println("----------------------------------------");
                    System.out.println("The #2 group value is "+summ1);
                    System.out.println("----------------------------------------");

                    //#3 group
                    System.out.println("#3 group");

                    System.out.print("Enter first digit: ");
                    String digitInput8=input.next();
                    int digit8 = Integer.parseInt(digitInput8, 16);
                    int resultt8 = (int) Math.pow(hexabase1, 3) * digit8;

                    System.out.print("Enter second digit: ");
                    String digitInput9=input.next();
                    int digit9 = Integer.parseInt(digitInput9, 16);
                    int resultt9 = (int) Math.pow(hexabase1, 2) * digit9;


                    System.out.print("Enter third digit: ");
                    String digitInput10=input.next();
                    int digit10 = Integer.parseInt(digitInput10, 16);
                    int resultt10 = (int) Math.pow(hexabase1, 1) * digit10;

                    System.out.print("Enter fourth digit: ");
                    String digitInput11 = input.next();
                    int digit11 = Integer.parseInt(digitInput11, 16);
                    int resultt11 = (int) Math.pow(hexabase1, 0) * digit11;

                    int summ2 = resultt8 + resultt9 + resultt10 + resultt11;
                    System.out.println("----------------------------------------");
                    System.out.println("The #3 group value is "+summ2);
                    System.out.println("----------------------------------------");

                    //#4 group
                    System.out.println("#4 group");

                    System.out.print("Enter first digit: ");
                    String digitInput12=input.next();
                    int digit12 = Integer.parseInt(digitInput12, 16);
                    int resultt12 = (int) Math.pow(hexabase1, 3) * digit12;

                    System.out.print("Enter second digit: ");
                    String digitInput13=input.next();
                    int digit13 = Integer.parseInt(digitInput13, 16);
                    int resultt13 = (int) Math.pow(hexabase1, 2) * digit13;


                    System.out.print("Enter third digit: ");
                    String digitInput14=input.next();
                    int digit14 = Integer.parseInt(digitInput14, 16);
                    int resultt14 = (int) Math.pow(hexabase1, 1) * digit14;

                    System.out.print("Enter fourth digit: ");
                    String digitInput15 = input.next();
                    int digit15 = Integer.parseInt(digitInput15, 16);
                    int resultt15 = (int) Math.pow(hexabase1, 0) * digit15;

                    int summ3 = resultt12 + resultt13 + resultt14 + resultt15;
                    System.out.println("----------------------------------------");
                    System.out.println("The 4# group value is "+summ3);
                    System.out.println("----------------------------------------");

                    //#5 group
                    System.out.println("#5 group");

                    System.out.print("Enter first digit: ");
                    String digitInput16=input.next();
                    int digit16 = Integer.parseInt(digitInput16, 16);
                    int resultt16 = (int) Math.pow(hexabase1, 3) * digit16;

                    System.out.print("Enter second digit: ");
                    String digitInput17=input.next();
                    int digit17 = Integer.parseInt(digitInput17, 16);
                    int resultt17 = (int) Math.pow(hexabase1, 2) * digit17;


                    System.out.print("Enter third digit: ");
                    String digitInput18=input.next();
                    int digit18 = Integer.parseInt(digitInput18, 16);
                    int resultt18 = (int) Math.pow(hexabase1, 1) * digit18;

                    System.out.print("Enter fourth digit: ");
                    String digitInput19 = input.next();
                    int digit19 = Integer.parseInt(digitInput19, 16);
                    int resultt19 = (int) Math.pow(hexabase1, 0) * digit19;

                    int summ4 = resultt16 + resultt17 + resultt18 + resultt19;
                    System.out.println("----------------------------------------");
                    System.out.println("The #5 group value is "+summ4);
                    System.out.println("----------------------------------------");

                    //#6 group
                    System.out.println("#6 group");

                    System.out.print("Enter first digit: ");
                    String digitInput20=input.next();
                    int digit20 = Integer.parseInt(digitInput20, 16);
                    int resultt20 = (int) Math.pow(hexabase1, 3) * digit20;

                    System.out.print("Enter second digit: ");
                    String digitInput21=input.next();
                    int digit21 = Integer.parseInt(digitInput21, 16);
                    int resultt21 = (int) Math.pow(hexabase1, 2) * digit21;


                    System.out.print("Enter third digit: ");
                    String digitInput22=input.next();
                    int digit22 = Integer.parseInt(digitInput22, 16);
                    int resultt22= (int) Math.pow(hexabase1, 1) * digit22;

                    System.out.print("Enter fourth digit: ");
                    String digitInput23 = input.next();
                    int digit23 = Integer.parseInt(digitInput23, 16);
                    int resultt23 = (int) Math.pow(hexabase1, 0) * digit23;

                    int summ5 = resultt20 + resultt21 + resultt22 + resultt23;
                    System.out.println("----------------------------------------");
                    System.out.println("The #6 group value is "+summ5);
                    System.out.println("----------------------------------------");

                    //#7 group
                    System.out.println("#7 group");

                    System.out.print("Enter first digit: ");
                    String digitInput24=input.next();
                    int digit24 = Integer.parseInt(digitInput24, 16);
                    int resultt24 = (int) Math.pow(hexabase1, 3) * digit24;

                    System.out.print("Enter second digit: ");
                    String digitInput25=input.next();
                    int digit25 = Integer.parseInt(digitInput25, 16);
                    int resultt25 = (int) Math.pow(hexabase1, 2) * digit25;


                    System.out.print("Enter third digit: ");
                    String digitInput26=input.next();
                    int digit26 = Integer.parseInt(digitInput26, 16);
                    int resultt26= (int) Math.pow(hexabase1, 1) * digit26;

                    System.out.print("Enter fourth digit: ");
                    String digitInput27 = input.next();
                    int digit27 = Integer.parseInt(digitInput27, 16);
                    int resultt27 = (int) Math.pow(hexabase1, 0) * digit27;

                    int summ6 = resultt24 + resultt25 + resultt26 + resultt27;
                    System.out.println("----------------------------------------");
                    System.out.println("The #7 group value is "+summ6);
                    System.out.println("----------------------------------------");

                    //#8 group
                    System.out.println("#8 group");

                    System.out.print("Enter first digit: ");
                    String digitInput28=input.next();
                    int digit28 = Integer.parseInt(digitInput28, 16);
                    int resultt28 = (int) Math.pow(hexabase1, 3) * digit28;

                    System.out.print("Enter second digit: ");
                    String digitInput29=input.next();
                    int digit29 = Integer.parseInt(digitInput29, 16);
                    int resultt29 = (int) Math.pow(hexabase1, 2) * digit29;


                    System.out.print("Enter third digit: ");
                    String digitInput30=input.next();
                    int digit30 = Integer.parseInt(digitInput30, 16);
                    int resultt30= (int) Math.pow(hexabase1, 1) * digit30;

                    System.out.print("Enter fourth digit: ");
                    String digitInput31 = input.next();
                    int digit31 = Integer.parseInt(digitInput31, 16);
                    int resultt31 = (int) Math.pow(hexabase1, 0) * digit31;

                    int summ7 = resultt28 + resultt29 + resultt30 + resultt31;
                    System.out.println("----------------------------------------");
                    System.out.println("The #8 group value is "+summ7);
                    System.out.println("----------------------------------------");

                    System.out.println("The converted IP address is "+summ+":"+summ1+":"+summ2+":"+summ3+":"+summ4+
                            ":"+summ5+":"+summ6+":"+summ7);


                    //End
                    System.out.print("Input any number to CONTINUE and 0 to END: ");
                    int end = input.nextInt();

                    if (end == 0) {
                        System.out.println("Program terminated.");
                        System.exit(0);
                    }
                }
            default:
                System.out.println("Enter only 1 or 2");
        }
    }
}