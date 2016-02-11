from math import ceil
n, d = map(int, input().split())
b = list(map(int, input().split()))
m = 0
for i in range(1, n):
	diff = b[i - 1] - b[i]
	if(diff >= 0):
		if(diff == 0):
			m += 1
			b[i] += d
		else:
			k = ceil(diff/d)
			m += k
			b[i] += d * k
print(m)