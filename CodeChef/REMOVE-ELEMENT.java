/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

@author: mr.prakashnatarajan@gmail.com
*/
public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(A[i] == elem) {
                count++;    //counting the number of repeating elem
            }
            else if (count > 0) {
                A[i - count] = A[i];    //shifting the bit to override to have inplace replace
            }
        }
        return len - count; //return the new length
    }
}
