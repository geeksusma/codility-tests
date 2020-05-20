# CODILITY TESTS
In this repo I will implement some algorithms you could find in recruitment platforms like "codility"
The idea is to be selftrained, and also to help you to check your skills if you're looking for a new job

If you want to add a test, don't hesitate to contact me (jesusmvillarvazquez@gmail.com)

## Find the max binary gap
A binary gap is a collection of 0's between 1's. So:

1000 -> is not a binary gap
10001 -> is a binary gap with a size of 3

100101001 -> it has three binary gaps with a maximum gap of two

Please, code a solution to calculate the maximum binary gap for a given integer. Check the next examples

100 -> 0 (4 in decimal)
1001 -> 2 (9 in decimal)
101001000100001 -> 4 (21025)
10100 -> 1 (20)

* Find my solution in the "test" folder, I coded it using TDD :)

## Array rotation
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].