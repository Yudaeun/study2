install.packages("tm")
library(tm)
data(acq)
class(acq)
acq
inspect(acq)
inspect(acq[1])
acq[[1]]$content
acq[[1]]$meta
lapply(acq,function(x) {x$content})
txt<-"�ȳ��ϼ���. �ݰ����ϴ�. 3234 ? ;.
�׷��� R�� �� ���׿�. �ڵ��� ����� TV"
cat(txt)
removeNumbers(txt)
removePunctuation(txt)
removeWords(txt,"�����")
removeWords(txt,"�ȳ�")
stripWhitespace(txt)
docs<-acq[1]
docs[[1]]$content
docs<-tm_map(docs,removeNumbers)
docs[[1]]$content
docs<-tm_map(docs,removePunctuation)
docs[[1]]$content
docs<-tm_map(docs,removePunctuation,preserve_intra_word_dashes=TRUE)
docs<-tm_map(docs,removePunctuation,preserve_intra_word_dashes=TRUE,preserve_intra_contractions=TRUE)
docs<-tm_map(docs,removeWords,stopwords("english"))
docs$content
acq<-lapply(acq,removeWords,stopwords("english"))
docs<-tm_map(docs,stripWhitespace)
install.packages("SnowballC")
library(SnowballC)
docs <- tm_map(docs, stemDocument)

