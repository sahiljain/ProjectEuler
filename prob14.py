#try to subtract one and divide by 3,
#if it's not possible, * by 2

cur = 8
while cur < 100000000:
	if (cur-1)%3==0:
		cur = (cur-1)/3
	else:
		cur*=2
	if cur < 1000000:
		print cur
input()