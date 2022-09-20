package 문자열;

import java.time.LocalDateTime;

public class StringCompare {
    public static void main(String[] args) {

    //String
        LocalDateTime StringST = LocalDateTime.now();
        System.out.print("String Strat Time : ");
        System.out.println(StringST.getNano());

        String sTest = new String();
        sTest = "String Test aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        sTest = sTest + "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        System.out.println(sTest);

        LocalDateTime StringFT = LocalDateTime.now();
        System.out.print("String Finish Time : ");
        System.out.println(StringFT.getNano());
        System.out.println();



    //StringBuffer
        LocalDateTime sBufferST = LocalDateTime.now();
        System.out.print("StringBuffer Strat Time : ");
        System.out.println(sBufferST.getNano());

        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("StringBuffer Test aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        sBuffer.append(" bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        System.out.println(sBuffer);

        LocalDateTime sBufferFT = LocalDateTime.now();
        System.out.print("StringBuffer Finish Time : ");
        System.out.println(sBufferFT.getNano());
        System.out.println();



    //StringBuilder
        LocalDateTime sBuilderST = LocalDateTime.now();
        System.out.print("StringBuilder Strat Time : ");
        System.out.println(sBuilderST.getNano());

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("StringBuilder aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        sBuilder.append(" bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        System.out.println(sBuilder);

        LocalDateTime sBuilderFT = LocalDateTime.now();
        System.out.print("StringBuilder Finish Time : ");
        System.out.println(sBuilderFT.getNano());
        System.out.println();

    }
}
