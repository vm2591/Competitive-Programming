Q Sum of elements between k1'th and k2'th smallest elements

Given an array of integers and two numbers k1 and k2. Find sum of all elements between given two k1’th and k2’th smallest elements of array. It may be assumed that (1 <= k1 < k2 <= n) and all elements of array are distinct.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N, denoting the length of the array. Next line contains N space seperated integers of the array. Third line contains two space seperated integers denoting k1'th and k2'th smallest elements.

Output:
For each test case in a new line output the sum of all the elements between k1'th and k2'th smallest elements.

Constraints:
1<= T <= 100
1<= k1< K2 <= N <=50


Example:

Input

2
7
20 8 22 4 12 10 14
3 6
6
10 2 50 12 48 13
2 6

Output

26
73

Explanation:

Test Case 1 -
3rd smallest element is 10
6th smallest element is 20
Sum of all element between k1 & k2 is 12 + 14 = 26
