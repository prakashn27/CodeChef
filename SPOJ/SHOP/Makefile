all: main.exe

main.exe:
	g++ main.cpp -o main.exe

clean:
	rm main.exe

debug:
	g++ -DDEBUG main.cpp -o main.exe
	./main.exe < test.input

test: main.exe
	./main.exe < test.input