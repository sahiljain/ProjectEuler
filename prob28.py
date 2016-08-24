def printSum(layers):
	sum = 1
	iter = 1
	for i in range(1, layers + 1):
		iter += 2*i
		sum += iter
		iter += 2*i
		sum += iter
		iter += 2*i
		sum += iter
		iter += 2*i
		sum += iter

	return sum




print(printSum(500))