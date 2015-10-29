__author__ = 'prakashn'


def know_solution(a, b, c):
    if a == 1:
        if b == 1 or c == 1:
            return True
        else:
            return False
    else:
        if b == 1 and c == 1:
            return True
        else:
            return False

count = input()

countOfSolution = 0

while count > 0:
    inp = raw_input()
    (a, b, c) = map(int, inp.split(' '))
    # print a, b, c
    if a == 1:
        if b == 1 or c == 1:
            countOfSolution += 1
    elif b == 1 and c == 1:
        countOfSolution += 1
    count -= 1

print countOfSolution
