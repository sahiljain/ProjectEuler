numWays = 1
total = 200
coins = [100, 50, 20, 10, 5, 2, 1]

remainingTotal = 200
while True:
	if remainingTotal <= 0:
		if remainingTotal == 0:
			numWays += 1
		break
	else:
		remainingTotal2 = remainingTotal
		while True:
			if remainingTotal2 <= 0:
				if remainingTotal2 == 0:
					numWays += 1
				break
			else:
				remainingTotal3 = remainingTotal2
				while True:
					if remainingTotal3 <= 0:
						if remainingTotal3 == 0:
							numWays += 1
						break
					else:
						remainingTotal4 = remainingTotal3
						while True:
							if remainingTotal4 <= 0:
								if remainingTotal4 == 0:
									numWays += 1
								break
							else:
								remainingTotal5 = remainingTotal4
								while True:
									if remainingTotal5 <= 0:
										if remainingTotal5 == 0:
											numWays += 1
										break
									else:
										remainingTotal6 = remainingTotal5
										while True:
											if remainingTotal6 <= 0:
												if remainingTotal6 == 0:
													numWays += 1
												break
											else:
												remainingTotal7 = remainingTotal6
												while True:
													if remainingTotal7 <= 0:
														if remainingTotal7 == 0:
															numWays += 1
														break
													else:
														pass
													remainingTotal7 -= 1
											remainingTotal6 -= 2
									remainingTotal5 -= 5
							remainingTotal4 -= 10
					remainingTotal3 -= 20
			remainingTotal2 -= 50
	remainingTotal -= 100

print(numWays)