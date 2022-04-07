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
txt<-"안녕하세요. 반갑습니다. 3234 ? ;.
그런데 R은 참 쉽네요. 자동차 냉장고 TV"
cat(txt)
removeNumbers(txt)
removePunctuation(txt)
removeWords(txt,"냉장고")
removeWords(txt,"안녕")
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

