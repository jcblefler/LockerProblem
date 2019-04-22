package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Write a program to simulate the following experiment. You have 100 closed lockers.
        Start with the first locker and for every locker open it. Now, starting with the
        second locker, for this locker and every second locker after that, if the locker is
        open, close it; if it is closed, open it. Then, starting with the third locker, for
        this locker and every third locker after that, if the locker is open, close it; if
        it is closed, open it. Continue with the nth locker changing the “position” of every
        nth locker until n = 100. Print out the locker numbers that remain open. What do you
        notice about the lockers that remain open?
        */


        int[] locker = new int[100];
        int count = 1;

        for (int l = 0; l < 100; l++){
            locker[l] = 1;
        }

        while (count < 100) {
            for (int i = count; i < 100; i = i + (count + 1)) {
                if (locker[i] == 1) {
                    locker[i] = 0;
                } else {
                    locker[i] = 1;
                }

            }
            count++;
        }
        for (int j = 0; j < 100; j++){
            if (locker[j] == 1) {
                System.out.println("Locker " + (j + 1) + " is opened");
            }
        }




    }
}
