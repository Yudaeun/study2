install.packages("twitteR") #트위터 분석, 데이터 추출
install.packages("ROAuth") # 인증 관련 
install.packages("base64enc") #한글처리
install.packages("tm") #영문 텍스트 분석용
install.packages("topicmodels") #토픽 모델링
install.packages("sentiment140") #감성분석
install.packages("igraph") #그래픽 처리
install.packages("ggplot2") #그래픽 처리
install.packages("SnowballC") # 텍스트 어간 추출용
library(twitteR);library(ROAuth)
consumer_key <- c("rr1FZWHkV96tsJNVUyz3yaQxM")
consumer_secret <- c("j0Vy7ahfOrVnLQbuDu0OvmIaRkv8lsocvUsJzP1CYH70F5JdeL")
access_token <- c("141858321-C4jSlIgSGA5Rj57P0mvxcp8aZ5gUFjK9P9laOlou")
access_secret <- c("rAteSAKY3NCqAuMm4JOrYDHqCHIU4UPkshG5x0h0RjB2Y")
setup_twitter_oauth(consumer_key, consumer_secret, access_token, access_secret)
library(twitteR)
library(ROAuth)
library(base64enc)
keyword <- enc2utf8("#방탄")
tweets <- searchTwitter(keyword, n=50)
tweets
tweets<-searchTwitter(enc2utf8('#BTS'), n=100, since='2022-04-05', until='2022-04-14') #한국어 트윗만 가져오도록 수정
strip_retweets(tweets,strip_manual=TRUE,strip_mt=TRUE) #리트윗 제거
df.tweets<-twListToDF(tweets)
availableTrendLocations()
closestTrendLocations(35.82,128.75)
getTrends(1132466) #대구지역 트렌드
library(twitteR)
library(ROAuth)
library(KoNLP)
library(tm)
library(SnowballC)
library(base64enc)
library(ggplot2)
library(wordcloud)
tweets<-userTimeline("POTUS",n=500) #타임라인에서 트윗 데이터 가져오기
tweets.df<-twListToDF(tweets) # 리스트를 데이터 프레임으로 변환
write.csv(tweets.df,"Trump.timeline.csv") #트윗 데이터 프레임을 파일로 저장
tweets.df[10,c("id","created","screenName","replyToSN","favoriteCount","retweetCount","longitude","latitude","text")]
myCorpus<-Corpus(VectorSource(tweets.df$text)) #말뭉치를 만들고 벡터의 구성요소를 문서로 사용

myCorpus<-tm_map(myCorpus,removePunctuation) #구둣점제거
removeURL<-function(x) gsub("http[^[:space:]]*","",x) #URL제거 함수 작성
myCorpus<-tm_map(myCorpus,content_transformer(removeURL))
#말뭉치를 만들고 벡터의 구성요소를 문서로 사용
myCorpus<-tm_map(mycorpus,removePunctuation) #구둣점제거
removeURL<-function(x) gsub("http[^[:space:]]*","",x)
myCorpus<-tm_map(myCorpus,content_transformer(removeURL))
removeNumPunct<-function(x) gsub("[^[:alpha:][:space:]]*","",x)
myCorpus<-tm_map(myCorpus,content_transformer(removeNumPunct))
myStopwords<-c(setdiff(stopwords('english'),c("big data")),"use","see","used","via","amp")
myCorpus<-tm_map(myCorpus,removeWords,myStopwords)
myCorpus<-tm_map(myCorpus,tolower) #소문자로 변환
myCorpus<-tm_map(myCorpus,stripWhitespace) #두 개 이상의 공백을 하나로 바꿈
myCorpusCopy<-myCorpus
replaceWord<-function(corpus,oldword,newword){
  tm_map(corpus,content_transformer(gsub),pattern=oldword,replacement=newword)
} #단어 대체 함수 작성
myCorpus<-replaceWord(myCorpus,"healthcar","heealthcare")
myCorpus<-tm_map(myCorpus,stemDocument) #단어 어근 정리
tdm<-TermDocumentMatrix(myCorpus,control=list(wordLengths=c(1,Inf)))
tdm
as.matrix(tdm)
freq.terms<-findFreqTerms(tdm,lowfreq=20) #20번 이상 사용된 단어를 찾아서 저장 
term.freq<-rowSums(as.matrix(tdm)) #각 단어의 사용횟수 기록
term.freq<-subset(term.freq,term.freq>=20)
df<-data.frame(term=names(term.freq),freq=term.freq)

ggplot(df,aes(x=term,y=freq))+geom_bar(stat="identity")+xlab("단어")+ylab("빈도")+coord_flip()+theme(axis.text=element_text(size=12))

m<-as.matrix(tdm)
word.freq<-sort(rowSums(m),decreasing=T) #단어별 사용횟수로 정렬 
pal<-brewer.pal(9,"BuGn")[-(1:4)] #색상 
wordcloud(words=names(word.freq),freq=word.freq,min.freq=3,random.order=F,colors=pal)
tweets.df<-twListToDF(tweets)
g<-ggplot(data=tweets.df,aes(x=created,y=retweetCount))+geom_line(color="purple",size=1)+theme_bw()
g2<-g+geom_point(size=2,color=ifelse(tweets.df$retweetCount>=40000,"red","blue"))
g3<-g2+xlab("일자")+ylab("리트윗 횟수")
g4<-g3+geom_text(aes(label=tweets.df$text),hjust=1,vjust=1)
g4<-g3+geom_text(aes(label=ifelse(tweets.df$retweetCount>40000,removeURL(tweets.df$text),""),hjust=1,vjust=-1))
g4

# 트위터 데이터 추출
twPath<-"C:\\Users\\Day\\Desktop\\빅데\\tweet\\"
#트윗 데이터 수집
for(i in 1:240){
  tweets<-searchTwitter("#리츠",n=250,lang="en")
  tweets.df<-twListToDF(tweets)
  twFile<-sprintf("C:\\Users\\Day\\Desktop\\빅데\\tweet\\twData.csv",paste(Sys.Date(),"-",i,sep=""))
}

write.csv(tweets.df,file=paste0(twPath,twFile),row.names=FALSE)
cat("트윗 데이터 수집 No.",i,"\n")
wTime<-3600
Sys.sleep(wTime)
twFiles<-list.files(path="C:\\Users\\Day\\Desktop\\빅데\\tweet\\",pattern="twData")
tw.df<-NULL

for(i in twFiles){
  tmp.df<-read.csv(paste0(twPath,i))
  tw.df<-rbind(tw.df,tmp.df)
}

#감성분석
install.packages("devtools")
library(devtools)
install_github("okugami79/sentiment140")
library(sentiment)
sentiment("How are you?")
sentiment("Israeli forces killed dozens of Palestinians in bloody clashes at the Gaza border Monday in the deadliest day there since the 2014 war, as the US officially opened its Embassy in Jerusalem just 50 miles away.")
sentiment("The Americans -- Kim Dong Chul, Kim Hak-song and Kim Sang Duk, also known as Tony Kim -- were freed while Secretary of State Mike Pompeo was on a visit to the North Korean capital of Pyongyang to discuss President Donald Trump's upcoming summit     with North Korean leader Kim Jong Un")

twFiles<-list.files(path="C:\\Users\\Day\\Desktop\\빅데\\tweet\\")
tw.df<-NULL
for(i in twFiles){
  tmp.df<-read.csv(paste0("C:\\Users\\Day\\Desktop\\빅데\\tweet\\",i))
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
tw.df$text<-gsub("[[:punct:]]","",tw.df$text) #특수 문자 삭제
sentiment.trump<-sentiment(tw.df$text)
table(sentiment.trump$polarity)

#트윗별 감성점수를 부여한다. 긍정 1점 부정 -1점 중립 0점
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
