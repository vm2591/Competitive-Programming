Given an array of distinct positive numbers, the task is to calculate the number of subsets (or subsequences) from the array such that each subset contains consecutive numbers.

Input:

The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N, denoting the length of the array. Next line contains N space seperated integers of the array. 
Output:

For each test case output a new line denoting count of number of such subset's that contains consecutive numbers.
Constraints:

1<=T<=100
1<=N<=50

Example:

Input

2
11
100 56 5 6 102 58 101 57 7 103 5
3
10 100 105

Output

3
3

Explanation

Test Case 1 - 

{5, 6, 7}, { 56, 57, 58, 59}, {100, 101, 102, 103} are 3 subset in which numbers are consecutive.

Test Case 2 -

{10}, {100} and {105} are 3 subset in which numbers are consecutive.
