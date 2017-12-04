import random
cnt_query=[]
query=[]

for i in range(1000):
	data=''
	for j in range(8):
		data+=str(random.randint(0,1))
	query.append(data)

for i in query:
	print(i)

for j in range(len(query[0])):
	cnt=0
	for i in query:
		if i[j]=='1': cnt+=1
	cnt_query.append(cnt)

print('Нужно аудиторий: ',max(cnt_query))




