array=[]
for i in range(10):
  array.append(int(input()))

for i in range(len(array)):
  for j in range(i+1, len(array)):
    if array[i]>array[j]:
      array[i],array[j]=array[j],array[i]

for a in array:
  print(a,end=' ')
