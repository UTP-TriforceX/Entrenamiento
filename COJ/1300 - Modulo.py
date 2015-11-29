#1300 - Modulo
#http://coj.uci.cu/24h/problem.xhtml?abb=1300

lst = []
cont = 0

for i in range(42):
	lst.append(0)

for i in range(10):
	n = int(raw_input())

	if lst[n%42] == 0:
		lst[n%42] = 1

for i in range(42):
	if lst[i] == 1:
		cont = cont+1

print cont