values = []


f = open('prob67.txt', 'r')
i = 0
for line in f:
	cur_line = line.split()
	j = 0
	values.append([])
	while j <= i:
		values[i].append(int(cur_line[j]))
		j = j + 1
	i = i + 1
f.close()

answers = [[0 for x in range(y+1)] for y in range(i)]
for y in range(i-1, -1, -1):
	for x in range(y, -1, -1):
		answers[y][x] = values[y][x]
		if y < i-1:
			answers[y][x] = answers[y][x] + max(answers[y+1][x], answers[y+1][x+1])
print answers[0][0]