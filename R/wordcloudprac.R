install.packages("KoNLP")
install.packages("wordcloud")
install.packages("wordcloud2")
install.packages("rJava")
install.packages("multilinguer")
install.packages("KoNLP",
                 repos = c("https://forkonlp.r-universe.dev", "https://cloud.r-project.org"),INSTALL_opts = c("--no-multiarch"))
                
library(KoNLP)
library(wordcloud)
useNIADic()
data.org<-readLines("C:\\Users\\Day\\Desktop\\빅데\\워드클라우드_브렉시트.txt",,encoding="UTF-8")
data<-data.org
data.word<-sapply(data,extractNoun,USE.NAMES=F)
data=unlist(data.word)
data<-gsub("\t","",data)
data=Filter(function(x){nchar(x)>=2},data)
data<-gsub("\\d+","",data)
data<-gsub("\\(","",data)
data<-gsub("\\)","",data)
data<-gsub(" ","",data)
data <- gsub('”',"",data)
data <- gsub('[~!@#$%^&*()_+=?]<>','',data)
#data <- gsub("[A-Za-z]","",data)
data<-gsub("가능성","",data)

#21812167 유다은
#워드클라우드 실습(6) 18p
write(unlist(data),"data2.txt")
data2<-read.table("data2.txt")
wordcount<-table(data2)
wordcloud(names(wordcount),freq=wordcount,scale=c(5,1),rot.per=0.25,min.freq=3,random.order=F,random.color=T,colors=brewer.pal(9,"Set1"))

#워드클라우드 실습(9) 20p
library(wordcloud2)
wordcloud2(data=wordcount,size=1,shape="circle", color="random-dark", backgroundColor="grey", ellipticity = 0.3, rotateRatio=0.5)

library(devtools)
wordcloud2(data=wordcount,size=1.5, color="random-light", backgroundColor="pink", rotateRatio=0.75)

