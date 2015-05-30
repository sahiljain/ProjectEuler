days = [31,28,31,30,31,30,31,31,30,31,30,31]
leap_days = [31,29,31,30,31,30,31,31,30,31,30,31]

for i in range(1, 12):
	days[i] = days[i] + days[i-1]
	leap_days[i] = leap_days[i] + leap_days[i-1]

print days
print leap_days

# 1 Jan 1900 was a Monday.
# 1 Jan 1901 was a Tuesday
# A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
# How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

# Sunday = 0
# Saturday = 6

year = 1901
day = 0
day_of_week = 2
num_sundays = 0
is_leap_year = False

while year < 2001:
	#increment sundays
	if day_of_week == 0:
		if is_leap_year and (day in leap_days or day == 0):
			num_sundays = num_sundays+1
		elif not is_leap_year and day in days or day == 0:
			num_sundays = num_sundays+1
	day = day + 1
	day_of_week = (day_of_week + 1) % 7

	if (is_leap_year and day == 366) or not is_leap_year and day == 365:
		print str(year) + " " + str(day)
		day = 0
		year = year + 1
		if year % 4 == 0:
			is_leap_year = True
			print year
		else:
			is_leap_year = False

print num_sundays