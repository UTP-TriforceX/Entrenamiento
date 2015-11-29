#1688 - Eazzzzzy
#http://coj.uci.cu/24h/problem.xhtml?abb=1688

c = 0

while c >= 0:
	c = int(raw_input())

	if c == -1: break
	else:
		if c == 1:
			h = int(raw_input())

			for i in range(h):
				s = ""

				for j in range (h-(i+1)):
					s = s+" "
				for j in range (2*(i+1)-1):
					s = s+"*"
				print s
			print
		else:
			if c == 2:
				w, h = [int(x) for x in raw_input().split()]

				for i in range(h):
					s = ""

					for j in range (h-(i+1)):
						s = s+" "
					for j in range (w):
						s = s+"*"
					print s
				print
			else:
				if c == 3:
					w, h = [int(x) for x in raw_input().split()]

					for i in range(h):
						s = ""

						for j in range (w):
							s = s+"*"
						print s
					print