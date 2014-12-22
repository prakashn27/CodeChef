//
//  p1.swift
//  ProjectEuler-In-Swift
//
//  Created by Prakash on 12/22/14.
//  Copyright (c) 2014 prakashn. All rights reserved.
//

/* https://projecteuler.net/problem=1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

import Foundation
class Problem1 {
    func sumOfNaturalNumbers(n: Float) -> Float {
        return (n) * (n + 1)/2
    }
    
    func sumofMultiplesUptoM(m:Int, divisor:Int) -> Float {
        var numberOfElements = (m-1)/divisor    //sub 1 so as to not include the last element
        var sum = sumOfNaturalNumbers(Float(numberOfElements))
        return sum * Float(divisor)
    }
    /* when computing sum for 3 and 5, 15 is computed twice so subtracting once gives the answer */
    
    // ANSWER:
    func solution() -> String {
        var result = Int(sumofMultiplesUptoM(1000, divisor: 3) + sumofMultiplesUptoM(1000, divisor: 5) -
            sumofMultiplesUptoM(1000, divisor: 15))
        return "Problem 1 solution: \(result)"
    }
}
