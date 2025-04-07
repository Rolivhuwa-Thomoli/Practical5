public class Main {
    public static String dayOf(int verseNum){
        switch (verseNum){
            case 1 : return "first";
            case 2 : return "second";
            case 3 : return "third";
            case 4 : return "fourth";
            case 5 : return "fifth";
            case 6 : return "sixth";
            case 7 : return "seventh";
            case 8 : return "eighth";
            case 9 : return "nineth";
            case 10 : return "tenth";
            case 11 : return "eleventh";
            case 12 : return "twelfth";
            default: return "unknown";
        }
    }
    public static String line(int linenumber){
        switch (linenumber){
            case 1 : return "And a partridge in a pear tree.";
            case 2 : return "Two turtle doves,";
            case 3 : return "Three French hens,";
            case 4 : return "four calling birds,";
            case 5 : return "five gold rings,";
            case 6 : return "six geese a-laying,";
            case 7 : return "seven swans a-swimming,";
            case 8 : return "eight maids a-milking,";
            case 9 : return "nine ladies dancing,";
            case 10 : return "ten lords a-leaping,";
            case 11 : return "eleven pipers piping,";
            case 12 : return "twelve drummers drumming,";
            default: return "Error: out of bound!!!";
        }
    }

    public static void main(String[] args) {


        for(int verse = 1; verse<=12; verse++){
            System.out.println("On the "+dayOf(verse)+" day of Christmas my true love sent to me");
            if(verse ==1) {
                System.out.println("A partridge in a pear tree");
                System.out.println();
            }
            else {
                for (int linenum = verse; linenum > 0; linenum--)
                    System.out.println(line(linenum));
                    System.out.println();
            }
        }
    }
}