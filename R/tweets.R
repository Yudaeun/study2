install.packages("twitteR") #Ʈ���� �м�, ������ ����
install.packages("ROAuth") # ���� ���� 
install.packages("base64enc") #�ѱ�ó��
install.packages("tm") #���� �ؽ�Ʈ �м���
install.packages("topicmodels") #���� �𵨸�
install.packages("sentiment140") #�����м�
install.packages("igraph") #�׷��� ó��
install.packages("ggplot2") #�׷��� ó��
install.packages("SnowballC") # �ؽ�Ʈ � �����
library(twitteR);library(ROAuth)
consumer_key <- c("rr1FZWHkV96tsJNVUyz3yaQxM")
consumer_secret <- c("j0Vy7ahfOrVnLQbuDu0OvmIaRkv8lsocvUsJzP1CYH70F5JdeL")
access_token <- c("141858321-C4jSlIgSGA5Rj57P0mvxcp8aZ5gUFjK9P9laOlou")
access_secret <- c("rAteSAKY3NCqAuMm4JOrYDHqCHIU4UPkshG5x0h0RjB2Y")
setup_twitter_oauth(consumer_key, consumer_secret, access_token, access_secret)
library(twitteR)
library(ROAuth)
library(base64enc)
keyword <- enc2utf8("#��ź")
tweets <- searchTwitter(keyword, n=50)
tweets
tweets<-searchTwitter(enc2utf8('#BTS'), n=100, since='2022-04-05', until='2022-04-14') #�ѱ��� Ʈ���� ���������� ����
strip_retweets(tweets,strip_manual=TRUE,strip_mt=TRUE) #��Ʈ�� ����
df.tweets<-twListToDF(tweets)
availableTrendLocations()
closestTrendLocations(35.82,128.75)
getTrends(1132466) #�뱸���� Ʈ����
library(twitteR)
library(ROAuth)
library(KoNLP)
library(tm)
library(SnowballC)
library(base64enc)
library(ggplot2)
library(wordcloud)
tweets<-userTimeline("POTUS",n=500) #Ÿ�Ӷ��ο��� Ʈ�� ������ ��������
tweets.df<-twListToDF(tweets) # ����Ʈ�� ������ ���������� ��ȯ
write.csv(tweets.df,"Trump.timeline.csv") #Ʈ�� ������ �������� ���Ϸ� ����
tweets.df[10,c("id","created","screenName","replyToSN","favoriteCount","retweetCount","longitude","latitude","text")]
myCorpus<-Corpus(VectorSource(tweets.df$text)) #����ġ�� ����� ������ ������Ҹ� ������ ���

myCorpus<-tm_map(myCorpus,removePunctuation) #����������
removeURL<-function(x) gsub("http[^[:space:]]*","",x) #URL���� �Լ� �ۼ�
myCorpus<-tm_map(myCorpus,content_transformer(removeURL))
#����ġ�� ����� ������ ������Ҹ� ������ ���
myCorpus<-tm_map(mycorpus,removePunctuation) #����������
removeURL<-function(x) gsub("http[^[:space:]]*","",x)
myCorpus<-tm_map(myCorpus,content_transformer(removeURL))
removeNumPunct<-function(x) gsub("[^[:alpha:][:space:]]*","",x)
myCorpus<-tm_map(myCorpus,content_transformer(removeNumPunct))
myStopwords<-c(setdiff(stopwords('english'),c("big data")),"use","see","used","via","amp")
myCorpus<-tm_map(myCorpus,removeWords,myStopwords)
myCorpus<-tm_map(myCorpus,tolower) #�ҹ��ڷ� ��ȯ
myCorpus<-tm_map(myCorpus,stripWhitespace) #�� �� �̻��� ������ �ϳ��� �ٲ�
myCorpusCopy<-myCorpus
replaceWord<-function(corpus,oldword,newword){
  tm_map(corpus,content_transformer(gsub),pattern=oldword,replacement=newword)
} #�ܾ� ��ü �Լ� �ۼ�
myCorpus<-replaceWord(myCorpus,"healthcar","heealthcare")
myCorpus<-tm_map(myCorpus,stemDocument) #�ܾ� ��� ����
tdm<-TermDocumentMatrix(myCorpus,control=list(wordLengths=c(1,Inf)))
tdm
as.matrix(tdm)
freq.terms<-findFreqTerms(tdm,lowfreq=20) #20�� �̻� ���� �ܾ ã�Ƽ� ���� 
term.freq<-rowSums(as.matrix(tdm)) #�� �ܾ��� ���Ƚ�� ���
term.freq<-subset(term.freq,term.freq>=20)
df<-data.frame(term=names(term.freq),freq=term.freq)

ggplot(df,aes(x=term,y=freq))+geom_bar(stat="identity")+xlab("�ܾ�")+ylab("��")+coord_flip()+theme(axis.text=element_text(size=12))

m<-as.matrix(tdm)
word.freq<-sort(rowSums(m),decreasing=T) #�ܾ ���Ƚ���� ���� 
pal<-brewer.pal(9,"BuGn")[-(1:4)] #���� 
wordcloud(words=names(word.freq),freq=word.freq,min.freq=3,random.order=F,colors=pal)
tweets.df<-twListToDF(tweets)
g<-ggplot(data=tweets.df,aes(x=created,y=retweetCount))+geom_line(color="purple",size=1)+theme_bw()
g2<-g+geom_point(size=2,color=ifelse(tweets.df$retweetCount>=40000,"red","blue"))
g3<-g2+xlab("����")+ylab("��Ʈ�� Ƚ��")
g4<-g3+geom_text(aes(label=tweets.df$text),hjust=1,vjust=1)
g4<-g3+geom_text(aes(label=ifelse(tweets.df$retweetCount>40000,removeURL(tweets.df$text),""),hjust=1,vjust=-1))
g4

# Ʈ���� ������ ����
twPath<-"C:\\Users\\Day\\Desktop\\��\\tweet\\"
#Ʈ�� ������ ����
for(i in 1:240){
  tweets<-searchTwitter("#����",n=250,lang="en")
  tweets.df<-twListToDF(tweets)
  twFile<-sprintf("C:\\Users\\Day\\Desktop\\��\\tweet\\twData.csv",paste(Sys.Date(),"-",i,sep=""))
}

write.csv(tweets.df,file=paste0(twPath,twFile),row.names=FALSE)
cat("Ʈ�� ������ ���� No.",i,"\n")
wTime<-3600
Sys.sleep(wTime)
twFiles<-list.files(path="C:\\Users\\Day\\Desktop\\��\\tweet\\",pattern="twData")
tw.df<-NULL

for(i in twFiles){
  tmp.df<-read.csv(paste0(twPath,i))
  tw.df<-rbind(tw.df,tmp.df)
}

#�����м�
install.packages("devtools")
library(devtools)
install_github("okugami79/sentiment140")
library(sentiment)
sentiment("How are you?")
sentiment("Israeli forces killed dozens of Palestinians in bloody clashes at the Gaza border Monday in the deadliest day there since the 2014 war, as the US officially opened its Embassy in Jerusalem just 50 miles away.")
sentiment("The Americans -- Kim Dong Chul, Kim Hak-song and Kim Sang Duk, also known as Tony Kim -- were freed while Secretary of State Mike Pompeo was on a visit to the North Korean capital of Pyongyang to discuss President Donald Trump's upcoming summit     with North Korean leader Kim Jong Un")

twFiles<-list.files(path="C:\\Users\\Day\\Desktop\\��\\tweet\\")
tw.df<-NULL
for(i in twFiles){
  tmp.df<-read.csv(paste0("C:\\Users\\Day\\Desktop\\��\\tweet\\",i))
  tw.df<-rbind(tw.df,tmp.df)
}
n<-0
for(i in twFiles){
  n=n+1
  if((n%%24)==1){
    tmp.df<-read.csv(paste0(twPath,i))
    tw.df<-rbind(tw.df,tmp.df)
  }
}
tw.df$text<-gsub("[[:punct:]]","",tw.df$text) #Ư�� ���� ����
sentiment.trump<-sentiment(tw.df$text)
table(sentiment.trump$polarity)

#Ʈ���� ���������� �ο��Ѵ�. ���� 1�� ���� -1�� �߸� 0��
sentiment.trump$score<-0
sentiment.trump$score[sentiment.trump$polarity=="positive"]<-1
sentiment.trump$score[sentiment.trump$polarity=="neutral"]<-0
sentiment.trump$score[sentiment.trump$polarity=="negative"]<--1
sentiment.trump$date<-as.Date(tw.df$created)
result<-aggregate(score ~ date,data=sentiment.trump,sum)

I<-ggplot(data=result,aes(x=date,y=score))+geom_line(color="purple",size=1)+theme_bw()
I
I2<-I+geom_point(size=3,color="blue")
I2
I3<-I2+geom_text(aes(label=score),hjust=1,vjust=-1)
I3