'''input
qwertyuiopasdfghjklzxcvbnm
veamhjsgqocnrbfxdtwkylupzi
TwccpQZAvb2017
'''

def run():
    a = raw_input()
    A = a.upper()
    b = raw_input()
    B = b.upper()
    c = raw_input()
    result = ""
    for ch in c:
        # print(ch, ch.islower())
        if ch.islower():
           result += b[a.index(ch)]
        elif ch.isupper():
            result += B[A.index(ch)]
        else:
            result += ch
    print result


if __name__ == "__main__":
    run()