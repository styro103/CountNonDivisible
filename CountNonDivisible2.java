/*
	Codility Count Non Divisble
	O(N^2)
*/

class Solution
{
    public int [] solution(int[] A)
    {
        int N = A.length; //Number of Elements
        int [] cnds = new int [N]; //Array of Counts of Non Divisors
        
        for (int i=0; i<N; i++) //Loop Through Array
        {
            for (int j=0; j<N; j++) //Compare Each Element With Element
            {
                if (i==j) continue; //Skip If Checking Self
                if (A[i]%A[j]!=0) cnds[i]++; //If Non Divisor, Increase Count
            }
        }
        
        return cnds; //Return Array of Counts
    }
}