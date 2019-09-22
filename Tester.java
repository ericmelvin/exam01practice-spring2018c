package exam01;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Tester {
    private static int numWrong;
    //-----------------------------------------------------------------------------------------
    //THESE METHODS ABOVE THE MAIN ARE NEEDED DO NOT COMMENT THEM OUT OR ALTER THEM
    private static void testEquality(Object expected, Object actual) {
        if (!expected.toString().equals(actual.toString())) {
            ++numWrong;
            System.out.printf("FAILED: Expected '%s', received '%s'\n",
                expected.toString(), actual.toString());
        } else {
            System.out.printf("Passed: '%s' == '%s'\n",
                expected.toString(),
                actual.toString());
        }
    }
    private static void testEquality(int[] expected, int[] actual) {
        testEquality(Arrays.toString(expected), Arrays.toString(actual));
    }
    //-------------------------------------------------------------------------------------
    public static void main(String[] args) {
        testQ1();
        System.out.println("--------------------");
        testQ2();
        System.out.println("--------------------");
        testQ3();
        System.out.println("--------------------");
        System.out.println(numWrong + " tests failed");
    }
    public static void testQ1() {
        System.out.println("*********TESTING QUESTION 1 (Worth 3 points)********\n");
        int[] arr1 = new int[] {
            1,
            18,
            9,
            8
        };
        int[] arr2 = new int[] {
            11,
            1,
            12,
            1,
            10
        };
        int[] arr3 = new int[] {
            1,
            4,
            5,
            5,
            5,
            5
        };
        testEquality(new int[] {
            4
        }, ArrayUtil.countAboveAverages(arr3));
        testEquality(new int[] {
            1,
            3,
            4
        }, ArrayUtil.countAboveAverages(arr1, arr2, arr3));
    }
    public static void testQ2() {
        System.out.println("*********TESTING QUESTION 2 (Worth 3 points)********\n");
        List < Integer > list1 = new ArrayList < > (Arrays.asList(1, 2, 3, 4, 5));
        List < Integer > list2 = new ArrayList < > (Arrays.asList(2, 5, 7, 8, 11));
        testEquality(new ArrayList < Integer > (Arrays.asList(1, 2, 6, 24, 120)),
            ListUtil.partialProducts(list1));
        testEquality(new ArrayList < Integer > (Arrays.asList(2, 10, 70, 560, 6160)),
            ListUtil.partialProducts(list2));
    }
    public static void testQ3() {
        System.out.println("*********TESTING QUESTION 3 (Worth 4 points)********\n");
        System.out.println("WARNING: Add testQ3()'s body back in when you are done with " +
            "Question 3 and comment me out");
        
        Deck deck = new Deck();
        Card c1 = new Card(8, 'c');
        Card c2 = new Card(13, 'h');
        Card c3 = new Card(12, 's');
        Card c4 = new Card(8, 'd');
        Card c5 = new Card(10, 'h');
        Card c6 = new Card(1, 's');
        Card c7 = new Card(11, 'h');
        deck.insertCard(c1);
        deck.insertCard(c2);
        deck.insertCard(c3);
        deck.insertCard(c4);
        deck.insertCard(c5);
        deck.insertCard(c6);
        deck.insertCard(c7);
        testEquality("Ace of Clubs" , deck.earliestCard());
        testEquality("[Eight of Clubs, King of Hearts, Queen of Spades, Eight of Diamonds, Ten of Hearts, Ace of Spades, Jack of Hearts]", deck);
        deck.shiftFaces(3);
        testEquality("[Jack of Clubs, Three of Hearts, Two of Spades, Jack of Diamonds, King of Hearts, Four of Spades, Ace of Hearts]", deck);
       
    }
}