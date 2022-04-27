import numpy as np
import matplotlib.pyplot as plt
from matplotlib.image import imread

img=imread('cat.jpg')
plt.subplot(2,1,1)
plt.imshow(img)
plt.subplot(2,1,2)
plt.imshow(img)
plt.axis('off')
plt.show()