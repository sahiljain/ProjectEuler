key = [
"zero",
"one",
"two",
"three",
"four",
"five",
"six",
"seven",
"eight",
"nine",
"ten",
"eleven",
"twelve",
"thirteen",
"fourteen",
"fifteen",
"sixteen",
"seventeen",
"eighteen",
"nineteen"]

tens = [
"twenty",
"thirty",
"forty",
"fifty",
"sixty",
"seventy",
"eighty",
"ninety"]

def count(n):
	out = 0
	if n > 99:
		hunsdigit = n/100
		out+= len(key[hunsdigit]) + len("hundred")
	if n%100 > 19:
		if n > 99:
			out+= len("and")
		tensdigit = (n%100)/10 - 2
		out+=len(tens[tensdigit])
		if n%10>0:
			out+= len(key[n%10])
	elif n%100 > 0:
		if n > 99:
			out+= len("and")
		out+= len(key[n%100])
	return out

coun = 0
for i in range(1,1000):
	coun+=count(i)
print coun+len("onethousand")
input()

