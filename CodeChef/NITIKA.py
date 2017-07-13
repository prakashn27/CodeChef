
def test(name):
    ele = name.strip().lower().split()
    result = ""
    for e in ele[:-1]:
        result += e[0].upper() + '. '
    result += ele[-1][0].upper()
    result += ele[-1][1:]
    print(result)

def run():
    try:
        t = int(raw_input())
        for i in range(t):
            name = raw_input()
            test(name)
    except:
        print("error in evaluating")

if __name__ == "__main__":
    run()