#1023 - Financial Management
#http://coj.uci.cu/24h/problem.xhtml?abb=10231023

total=0

for i in range(12):
	n = float(raw_input())
	total+=n

total=total/12

print ("$%.2f" %total)

