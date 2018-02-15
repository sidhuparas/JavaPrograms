package com.parassidhu.control;

public class TheLastLaugh {

    public static void execute() {

        // So the program looks simple?
        // Answer should be "Haha"?
        // Looks can be deceiving
        // Answer at the end of the file

        System.out.print("H" + "a");
        System.out.print('H'+'a');
    }
}






// The output is Ha169, but why?
// First line is simple and outputs Ha as expected
// But second line consists of two char literals 'H' and 'a' which aren't
// strings unlike the first line. Since neither of the operand is string,
// compiler treats + operator as addition rather than concatenation.
// char is first converted to int and then added to get the output.
// The expression 'H' and 'a' is equivalent to int constant
// 72 + 97. Hence the second line outputs 72+97 = 169