# Enter your code here. Read input from STDIN. Print output to STDOUT
count = input()

for i in range(count):
    #    count for getting all the possible values
    input() # get the number of elements
    arr = list(map(int, raw_input().split()))
    if len(arr) == 1:
        print "{0} {1}".format(arr[0],arr[0])
        continue
    start_index = -1
    best_sum = 0
    best_start_index = -1
    best_end_index = 0
    cur_sum = 0
    cur_index = -1
    var_nc = 0 # container for non-contiguous
    for i in range(len(arr)):
        if arr[i] > 0:
            var_nc += arr[i]
        val = cur_sum + arr[i]
        if val > 0:
            if cur_sum == 0:
                cur_index = i
            cur_sum = val
        else:
            cur_sum = 0
        if best_sum < cur_sum:
            best_sum = cur_sum
            best_end_index = i
    print "{0} {1}".format(best_sum, var_nc)
        
              
 """
 input
 6
1
1
6
-1 -2 -3 -4 -5 -6
2
1 -2
3
1 2 3
1
-10
6
1 -1 -1 -1 -1 5

O/P
1 1
-1 -1
1 1
6 6
-10 -10
5 6
"""       