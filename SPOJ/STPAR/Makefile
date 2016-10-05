all: main.exe

main.exe:
	g++ main.cpp -o main.exe

clean:
	rm main.exe

test: main.exe
	./main.exe < test.input