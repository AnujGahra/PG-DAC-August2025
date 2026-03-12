import java.io.*;
import java.util.*;

class UserMainCode
{
    public int numberOfIdeas(int input1,int input2)
    {
        // write only region starts(int input1,int input2)
        int x = input1;
        int y = input2;
        int mod = 10000;
        int result = 0;
        
        for(int r = 1; r <= Math.min(x, y); r++)
        {
            int comb = 1;
            for(int i = 0; i < r; i++)
            {
                comb = comb * (x - i) / (i + 1);
                comb %= mod;
            }
            result = (result + comb) % mod;
        }
        return result;
        // write only region ends(int input1,int input2)
    }
    
    // Main method for testing
    public static void main(String[] args)
    {
        UserMainCode solution = new UserMainCode();
        
        // Test Case 1: input1=5, input2=3 → Expected: 25
        System.out.println("Test 1: " + solution.numberOfIdeas(5, 3));
        
        // Test Case 2: input1=4, input2=2 → Expected: 10  
        System.out.println("Test 2: " + solution.numberOfIdeas(4, 2));
        
        // Test Case 3: input1=3, input2=5 → Expected: 7 (C(3,1)+C(3,2)+C(3,3))
        System.out.println("Test 3: " + solution.numberOfIdeas(3, 5));
    }
}
