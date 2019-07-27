package ee.taltech.itcolledge.groups;

import java.util.Scanner;

public class GroupDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------=============---------");
        System.out.println("Insert the number of people");
        int people = sc.nextInt();
        System.out.println("Insert the group size");
        int size = sc.nextInt();

        int groups = people / size;
        int leftover = people % size;
        int leftover2 = people - groups * size;

        System.out.println(String.format("You get %d full groups, leftover %d.", groups, leftover));
        System.out.println(String.format("You get %d full groups, leftover %d.", groups, leftover2));
        System.out.println("---------=============---------");
    }
}
