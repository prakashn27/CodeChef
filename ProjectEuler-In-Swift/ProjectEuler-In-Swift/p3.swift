//
//  p3.swift
//  ProjectEuler-In-Swift
//
//  Created by Prakash on 12/22/14.
//  Copyright (c) 2014 prakashn. All rights reserved.
//

import Foundation
/* 
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
class Problem3 {
    func findMax(arr: [Int]) -> Int {
        let max2 = arr.reduce(Int.min, { max($0, $1) }) //same as arr.reduce(Int.min, max)
        return max2
    }
    
    /* find all prime factors
    @param : n: Input
    @output: array: [Int]
    */
    func findPrimeFactors(n:Int) -> [Int] {
        var factors:[Int] = []
        var d = 2
        var num = n
        while num > 1 {
            while num % d == 0 {
                num = num/d
                factors.append(d)
            }
            d++
        }
        return factors
    }
    func largestPrimeFactor(n:Int) -> Int {
        var factors = findPrimeFactors(n)
        var maxPrime = findMax(factors)
        return maxPrime
    }
}

