def d(n):
	sum = 0
	for i in range(1,n):
		if n%i==0:
			sum+=i
	return sum

amicable = set()
for i in range(4,10000):
	if d(d(i))==i and i!=d(i):
		amicable.add(i)
		amicable.add(d(i))
print amicable
input()