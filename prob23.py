def is_abundant(n):
	sum = 1
	for i in range(2, n):
		if n % i == 0:
			sum = sum + i
	return sum > n


abundant = [12]

max_not_two_ab = 28123;

for i in range(13,28123-12+1):
	if is_abundant(i):
		abundant.append(i)

sums = []
for i in range(0, len(abundant)):
	for x in range(i,len(abundant)):
		sums.append(i + x)
sum = 0
for x in range(24, 28124):
	if x in sums:
		sum = sum + x

print sum