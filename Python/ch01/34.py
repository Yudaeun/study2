import numpy as np

x=np.array([[1.4],[-1]])
b1=np.array([[1.5],[-0.5]])
w1=np.array([[1.2,2.3],[1.5,4.2]])
w2=np.array([[1.2,2.3],[1.5,4.2]])
b2=np.array([[1.5],[-0.5]])

y1=np.dot(w1,x)+b1
o1=np.array([np.maximum(0,y1[0]),np.maximum(0,y1[1])])

print(y1.shape)
y2=w2.dot(y1)+b2
print(y2.shape)
o2=np.array([1/(1+np.exp(-y2[0])),1/(1+np.exp(-y2[1]))])
print("y1=\n",y1)
print("o1=\n",o1)
print("y2=\n",y2)
print("o2=\n",o2)

