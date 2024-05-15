//package com.example.demo;
//
//public class Main {
//
//    int fib(int n, int [] dp) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        if (dp[n]!= -1){
//            return dp[n];
//        }
//
//        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
//        return dp[n];
//    }
//
//
//    }
//    public static void main(String[] args) {
//        Main m = new Main();
//        int n = 10;
//        int dp[]= new int[n+1];
//        for(int i=1;i<=n;i++){
//            dp[i] = -1;
//        }
//        System.out.println("finding fibonacii of=" +n);
//        System.out.println(m.fib(n,dp));
//
////        Stacks
//    }
//
