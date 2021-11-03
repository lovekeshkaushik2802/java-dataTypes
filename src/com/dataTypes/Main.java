package com.dataTypes;

public class Main {

    public static void main(String[] args) {

  //      //********* Min and Max values of data types ********


        // int    = 4byte = 32bit
        // float  = 4byte = 32bit

        // double = 8byte = 64bit
        // char   = 2byte  = 16bit

// // ******* Byte , long, Short , int******

	int myIntMax = Integer.MAX_VALUE;
    int myIntMin = Integer.MIN_VALUE;
        System.out.println("max value for the integer is : " + myIntMax);
        System.out.println("min value for the integer is : " + myIntMin);

//      1 Byte = 8 bit

        byte myByteMax = Byte.MAX_VALUE;
        byte myByteMin = Byte.MIN_VALUE;
             System.out.println(" max vale for byte is " + myByteMax);
             System.out.println(" min vale for byte is " + myByteMin);


       short myShortMax = Short.MAX_VALUE;
       short myShortMin = Short.MIN_VALUE;
             System.out.println(" the Max value for short " + myShortMax);
             System.out.println(" the Min value for short " + myShortMin);


      double myDoubleMax = Double.MAX_VALUE;
      double myDoubleMin = Double.MIN_VALUE;
             System.out.println(" max value for double is " + myDoubleMax);
             System.out.println(" min value for double is " + myDoubleMin);


             int myInt = 2_22_222_44;
                  System.out.println(myInt);


                  long mySuitableLong = 1000L;
        System.out.println(mySuitableLong);

        long myLongMax = Long.MAX_VALUE;
        long myLongMin = Long.MIN_VALUE;
        System.out.println(" max value for long is " + myLongMax);
        System.out.println(" min value for long is " + myLongMin);


        long bigLong = 2_147_483_647_234L;
        System.out.println(bigLong);

//
//        // ********** CASTING IN JAVA ************
//        // CASTING means to convert one data type to another data type

        int myCast = 3333;
        byte myNewByte =(byte) (myByteMin/2);
        short myNewShortValue =(short) (myShortMin/2);
        System.out.println(myCast);
        System.out.println(myNewByte);
        System.out.println(myNewShortValue);


//
////         ***********Challenge***********
////
////        your challenge is to create a byte variable and set it to any valid byte number,
////         it does not matter .
////         Create a short variable and set it to any valid short number.
////
////        Create an int variable and set it to any valid int number .
////         Lastly, create a variable of type long and make it equal to 50000
////         plus 10 times the sum of the byte plus the short plus the integer values.
////
//
         byte myChallengeByte = 22;
        short myChallengeShort = 456;
        int myChallengeInt = 3434;


        long myChallengeLong = 50000L + 10L *( myChallengeByte + myChallengeShort +myChallengeInt);
        System.out.println(" the answer is : " + myChallengeLong);

        short myShort =(short) (2000 + 10*(myChallengeByte + myChallengeShort +myChallengeInt));
        System.out.println(myShort);


        int myIntValue = 5;
//        float myFloatValue =(float) 6.55;
        float myFloatValue = 6.55f;
        double myDoubleValue = 4.444d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        //*********challenge********

        double poundNumberConvert = 24d;
        double convertedToKilogram =  (poundNumberConvert * 0.45359237);
        System.out.println(convertedToKilogram);

//
//        double myDouble = 4343d;
//        double anotherDouble = 333_69.676_757d;
//        System.out.println(myDouble);
//        System.out.println(anotherDouble);


        //*****Char and boolean*****************

        char myChar = 'F';
        char myUnicode1 = '\u0044';
        char myUnicode2 = '\u0084';
        char myUnicode3= '\u00C5';
        char myUnicode4 = '\u0026';
        System.out.println(myChar);
        System.out.println(myUnicode1);
        System.out.println(myUnicode2);
        System.out.println(myUnicode3);
        System.out.println(myUnicode4);

//
//        boolean myAgeIsTwenty = true;
//        boolean yourNameRahul = false;



          // that are important variable in java 





    }
}
