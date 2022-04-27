import numpy as np
import matplotlib.pyplot as plt
import cv2
from google.colab.patches import cv2_imshow

def sigmoid_func(x):
  return 1/(1+np.exp(-x))

def Relu(x):
  return np.maximum(0,x)

x=np.arange(-2,3,0.1)
y_sigmoid=sigmoid_func(x)
plt.subplot(2,2,1)

plt.plot(x,y_sigmoid)
plt.title('Sigmoid')

y_relu=Relu(x)

plt.subplot(2,2,2)
plt.plot(x,y_sigmoid,label='sigmoid')
plt.plot(x,y_relu,label='relu')
plt.title('Relu & sigmoid')
plt.legend()

img_from_opencv=cv2.imread("cat.jpg")
cv2.waitKey(0)
cv2.destroyAllWindows()
b,g,r=cv2.split(img_from_opencv)
image_python=cv2.merge([r,g,b])
plt.subplot(2,2,3)
plt.imshow(image_python)

img_from_opencv=cv2.imread("cat.jpg")
plt.subplot(2,2,4)
plt.imshow(image_python)
