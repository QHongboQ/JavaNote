package zyBook_Chapter_2;

import java.util.Scanner;
/*
Problem Statement: A robot needs to retrieve an item that is located in rocky terrain adjacent to a road.
The robot can travel at a faster speed on the road than on the rocky terrain,
so it will want to do so for a certain distance before moving on a straight line to the item.

Your task is to compute the total time taken by the robot to reach its goal, given the following inputs:

The distance between the robot and the item in the x- and y-direction (dx and dy)
The speed of the robot on the road and the rocky terrain (s1 and s2)
The length l1 of the first segment (on the road)

To make the problem more concrete, let’s assume the following dimensions:

The total time is the time for traversing both segments.
The time to traverse the first segment is simply the length of the segment divided by the speed: 6 km divided by 5 km/h, or 1.2 hours.

To compute the time for the second segment, we first need to know its length.
It is the hypotenuse of a right triangle with side lengths 3 and 4.

This computation gives us enough information to devise an algorithm for the total travel time with arbitrary arguments:

Time for segment 1 = length of segment 1 / speed in segment 1
Length of segment 2 = square root of (square of dx + square of (dy - length of segment 1))
Time for segment 2 = length of segment 2 / speed in segment 2
Total time = time for segment 1 + time for segment 2
Translated into Java, the computations are

double segment1Time = segment1Length / segment1Speed;
double segment2Length = Math.sqrt(Math.pow(xDistance, 2)
   + Math.pow(yDistance - segment1Length, 2));
double segment2Time = segment2Length / segment2Speed;
double totalTime = segment1Time + segment2Time;
 */
public class zyBook_2_11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Total width: ");
        int totalWidth = in.nextInt();
        System.out.print("Tile width: ");
        int tileWidth = in.nextInt();

        int numberOfPairs = (totalWidth - tileWidth) / (2 * tileWidth);
        int numberOfTiles = 1 + 2 * numberOfPairs;
        double gap = (totalWidth - numberOfTiles * tileWidth) / 2.0;

        System.out.println("Number of tiles: " + numberOfTiles);
        System.out.println("Gap at each end: " + gap);
    }
}