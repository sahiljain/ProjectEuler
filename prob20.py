def factorial(n):
	result = n
	n-=1
	while n > 1:
		result*=n
		n-=1
	return result

mynum = str(factorial(100))
out = 0
for x in mynum:
	out+= int(x)
print out
input()

