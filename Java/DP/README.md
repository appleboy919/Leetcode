## Dynamic Programming

- Can **systematically** and **efficiently** explore **all possible solutions** to a problem
- Characteristics:
    - 1. problem can be broken down into **overlapping subproblems**
    - 2. problem has an **optimal substurcture**
- Methods:
    - **Tabulation**(Bottom-up):
        - Implemented with **iteration** ==> starts at **base case**
        - Faster runtime!
        - ex) Fibonacci sequence
            ```java
            int F[] = new int(n+1);
            F[0] = 0;
            F[1] = 1;
            for (int i=2;i<=n;i++)
                F[i] = F[i-1] + F[i-2];
            ```
    - **Memoization**(Top-down):
        - Implemented with **recursion**
        - **Memoize results* while in the recurssion process
        - Easier to write
        - ex) Fibonacci sequence
            ```java
            int M[] = new int(n+1);
            int fib(int x) {
                if (x==0||x==1)
                    return x;
                if (M[x]==0)
                    M[x] = F(x-1) + F(x-2);
                return M[x];
            }
            ```

## When to use DP

1. Problem asks for **optimal value**(e.g., maximum, minimum) or **number of ways to do something**
    - examples:
        - minimum cost of ~
        - maximum profit from ~
        - how many ways are thre to do ~
        - longest possible ~
        - Is it possible to reach a certain point ~
    - Might not be DP problems! --> **Greedy approgach**
2. Future decisions **depend on earlier decisions**
    - If so, only match for DP problems!