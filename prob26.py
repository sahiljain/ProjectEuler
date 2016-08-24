def printDec(denominator):
	numerator = 1
	for i in range(10):
		numerator *= 10
		x, numerator = divmod(numerator, denominator)
	targetX = x
	targetNumerator = numerator
	numerator *= 10
	x, numerator = divmod(numerator, denominator)
	numSteps = 0
	while numerator != targetNumerator or x != targetX:
		numerator *= 10
		x, numerator = divmod(numerator, denominator)
		numSteps += 1
	# print(denominator, numSteps)
	return denominator, numSteps

	
# printDec(17)	
maxSteps = 0
maxDenom = 0
for i in range(1, 1000):
 	denominator, numSteps = printDec(i)
 	if numSteps > maxSteps:
 		maxSteps = numSteps
 		maxDenom = denominator
 		
print(maxDenom)