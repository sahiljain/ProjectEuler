f = open('prob22.txt', 'r')
i = 1
sum = 0
for line in f:
	for c in list(line):
		if (ord(c) > 64 and ord(c) < 91):
			sum = sum + i * (ord(c) - 64)
	i = i + 1
f.close()

print sum