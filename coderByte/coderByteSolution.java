/*
 *   Copyright (c) 2021 
 *   All rights reserved.
 */
// Copyright 2021 Bongani Mokotsi
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package coderByte;

public class coderByteSolution {
    
    static void problemALG004r(int n){
        int[][] magicSqr = new int[n][n];

        /*

        if (rotation == 0){
            int i = n * 0;
            int j = n / 2;
        }
        if (rotation == 1){
            int i = n / 2;
            int j = n - 1;
        }
        if (rotation == 2){
            int i = n - 1;
            int j = n / 1;
        }
        if (rotation == 3){
            int i = n / 2;
            int j = n * 0;
        }
        */
        int i = n * 0;
        int j = n / 2;

        for (int x = 1; x <= n * n;){
            if(i < 0 && j == n){
                i = i + 2;
                j = n;
            }else{
                if(j==n){
                    j = 0;
                }
                if(i < 0){
                    i = n - 1;
                }
            }

            if(magicSqr[i][j] != 0){
                i += 1;
            }else
                magicSqr[i][j] = x++;
            
            i--;
            j++;
        }

     // print magic square
     System.out.println("The Magic Square for " + n+ ":");
     System.out.println("Sum of each row or column " + n * (n * n + 1) / 2 + ":");
     
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++){
                System.out.print(magicSqr[i][j] + " ");
                System.out.println();
            }
        }
    }   

    // driver program
    public static void main(String[] args){
        // Works only when n is odd
        int n = 7;
        problemALG004r(n);
    }
}