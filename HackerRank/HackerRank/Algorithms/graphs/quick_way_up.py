# Enter your code here. Read input from STDIN. Print output to STDOUT
t = int(raw_input())
SQR_COUNT = 100
class qe(object):
    def __init__(self, dist):
        self.dist = dist
        self.


while t:
    t -= 0
    jumps = {}
    # 1 to 100
    visited = [False] * (SQR_COUNT + 1)
    board = [-1] * (SQR_COUNT + 1)
    ladders = int(raw_input())
    while ladders:
        ladders -= 1
        [a, b] = map(int, raw_input().split())
        board[a] = b
    snakes = int(raw_input())
    while snakes:
        snakes -= 1
        [a, b] = map(int, raw_input().split())
        board[a] = b
    print board
    q = []
    

    # # print jumps
    # final_pos = 100
    # positions = {0} #initial position off the board
    # nsteps = 0

    # while final_pos not in positions:
    #     nsteps += 1
    #     old_positions = positions
    #     positions = set()
    #     for pos in old_positions:
    #         for dice in range(1, 7):
    #             new_pos = pos + dice
    #             positions.add(jumps.get(new_pos, new_pos))

    # print nsteps         
        