paste0("하나","둘","셋")
txt<-c("안녕하세요","정말요","진짜 안녕하신가요?", "멍멍아, 안녕")

grep("^안녕",txt,value=TRUE)
grep("안녕$",txt,value=TRUE)
x<-5
y<-15
print(x+y);print(x*y)
c(1,2,5,5:9)
v3<-seq(1,10,3)
v3
i<-0
repeat{
  i<-i+1
  if(i<10) {filter<-" "}
  else {filter<-""}
  cat("hello",filter,i,"\n")
  if(i>25) break
  
}
i<-0
while(i<25){
  i<-i+1
  if(i<10){filter<-" "}
     else {filter<-""}
  cat("hello",filter,i,"\n")
  
}
for(i in seq(5,25,5)){
  print(i)
}

for(i in seq(from=1,to=25,by=1)){
  if(i<10){filter<-" "}
  else{filter<-""}
  if(i>10 & i<20)
    next
  cat("hello",filter,i,"\n")
  
}

paste(c("하나","둘","셋"),1:3,sep=".")
paste("하나","둘","셋",sep="-")
paste0("하나","둘","셋셋")

txt2<-c("빅데이터","big data","빅데이터 분석","big data analysis","데이터베이스","database")
txt
nchar(txt)

txt<-"안녕하세요. 반갑습니다."
substr(txt,1,2)
substr(txt,8,12)
grep("안녕",txt,value=TRUE)
grep("big|분석",txt2,value=TRUE)

txt3<-c("12345","12살 어린이","December 1st!")
grep("[abcde]",txt3,value=TRUE)
grep("[0-9]",txt3,value=TRUE)
grep("[^0-9]",txt3,value=TRUE)
grep("[[:punct:]]",txt3,value=TRUE)

strsplit(txt," ")
strsplit(txt,".")
strsplit(txt,".",fixed=TRUE)

#사용자 정의함수
x<-c(30,50,90)
tdistance<-x*1.6
result<-paste(tdistance,"km",sep="")
print(result)

transMile<-function(x){
  if(!is.numeric(x))
    return ("숫자만 입력하세요")
  tmile<-x*1.6
  result<-paste(tmile,"km",sep="")
  return(result)
}
transMile(30)

transLength2<-function(x,mult,unit){
  tlength<-round(x*mult,digits=1)
  paste(tlength,unit,sep="")
}
transLength2(y,mult=3,unit="ft")

transMileKm <- function(x, y="M") {
  if (!is.numeric(x)) 
    return("첫 인수는 숫자만 입력하세요")
  if (!is.character(y)) 
    return("두번째 인수는 문자만 입력하세요")
  
  if (toupper(y) == "K") {
    mult <- 1/1.6
    unit <- "Mile" 
  }  else if (toupper(y) == "M") {
    mult <- 1.6
    unit <- "KM"
  } else {
    return ("두번째 인수는 K나 M만을 사용해야 합니다.")
  }
  
  tMileKm <- x * mult
  result <- paste(tMileKm, unit, sep=" ")
  return(result)
}

transMileKm(3,"M")

transLength2<-function(x,mult=0.9144,unit="m"){
  tlength2<-round(x*mult,digits=1)
  paste(tlength2,unit,sep="")
}
transLength2(y)
transLength2(y,mult=36,unit="in")

delChar<-function(x,y){
  txt <- "I saw her standing there; Misery; Anna (Go to him); Chains; Boys Ask me why"
  newTxt <- ""
  
  for(i in 1:nchar(txt)) {
    char = substr(txt,i,i)
    if(char == ";")
      char <- ""
    newTxt <- paste0(newTxt,char)
  }  
  
  newTxt
  
}
delChar()

#R데이터타입
seq(3,8)
seq(3,8,2)
seq(3.5,1,-0.5)
seq(0,100,length.out=9)
rep(1,3)
rep(c(1,2,3),times=3)
rep(c(1,2,3),each=3)
rep(c(1,2,3),times=c(1,2,3))
rep(1:5,length.out=14)
num<-c(2,4,6)
cha<-c("x","y","z")
c(num,cha)
str(num)
str(cha)
num<-c(2,4,6,8)
str(num)

month.abb
month.name
month<-c(12,10,2,1)
month.name[month]
num_1<-c(2,4,6,8)
month.abb[num_1]

1+2
2^10
c(1,2,3)+c(4,5,6)
x<-c(1,2,3);x*c(4,5,6)
x<-c(1:3);y<-c(4:9);x+y
c(1,3,5)+10
c(1,2,3)+c(4,5,6,7,8)

y<-c(0,25,50,75,100)
y==50

y<-c(0,25,50,75,100)
z<-c(50,50,50,50,50)
y==z
y!=z
y>z
y<z

x<- -3:3
abs(x)

log(1:5)
log(1:5,base=3)
exp(1:5)
sqrt(1:5)

#데이터 타입:MATRIX

y<-matrix(1:20,nrow=4,ncol=5)
y

examscore<-c(50,70,60,80,100,90)
cnames<-c("Business","English","Math")
rnames<-c("Kildong","Young")
exam<-matrix(examscore,nrow=2,ncol=3,byrow=TRUE,dimnames=list(rnames,cnames))
exam

name<-c("Kildong","Young")
business<-c(50,80)
english<-c(70,100)
math<-c(60,90)
exam<-data.frame(name,business,english,math)
exam

apply(exam,1,mean)
apply(exam,2,mean)
mean(exam$business)
mean_score<-(exam$business+exam$english+exam$math)/3
data.frame(name,business,english,math,mean_score)
A=matrix(c(3,2,3,5,2,4),nrow=3,ncol=2)
B=matrix(c(5,4,3),nrow=3,ncol=1)
cbind(A,B)

x<-array(1:12,c(2,3,2))
x
x[1,,]
a=c(2,4,6)
b=c("aa","bb","cc","dd","ee")
c=c(TRUE,FALSE,TRUE)
x=list(a,b,c,3)
x

gender<-factor(c("남자","여자","남자"))
summary(gender)

b<-c(1,2,NA,3)
sum(b,na.rm=T)
mean(b,na.rm=T)
x<-data.frame(x1=c(7,6,7,6),x2=c(7,NA,5,6),x3=c(5,4,NA,4))
x
y<-na.omit(x)
y

prime<-c(2,3,5,7,11,13,17,19)
prime[3]
prime[4:6]
prime[c(4,6)]
prime[-3]
prime[-4:-6]
prime[-(4:6)]
length(prime)
prime[1:length(prime)-1]
prime[-length(prime)]
prime[2]<-1
prime[c(2,3)]<-c(2,3)
prime
prime[c(10,11)]<-c(29,21)
prime[15]<-47
prime

rainfall <- c(21.6, 23.6, 45.8, 77.0, 102.2, 133.3, 327.9, 348.0, 137.6, 49.3, 53.0, 24.9)
rainfall > 100
z<-which(rainfall>100)
z
month.name[z]
month.kname<-c("1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월")
month.kname[which(rainfall>100)]


#R 데이터 프레임
v<-seq(1:12)
matrix(data=v,nrow=3,ncol=4)
rnames<-c("R1","R2","R3")
cnames<-c("C1","C2","C3","C4")
matrix(v,3,4,dimnames=list(rnames,cnames))

mat<-matrix(c(1,2,3,4),nrow=2)
mat
mat<-matrix(c(1,2,3,4),nrow=2,byrow=T)
mat
dim(mat)
nrow(mat)
ncol(mat)
length(mat)

mat<-matrix(seq(1:16),nrow=4)
mat
mat[1,];mat[,1];mat[3,3]
mat[1:3,2:3]; mat[,2:3]; mat[2:3,];
mat[,c(3,4)]; mat[,-c(3,4)]

mat2<-matrix(rep(1,time=9),nrow=3)
mat2
mat2<-rbind(mat2,c(2,2,2))
mat2<-cbind(mat2,c(3,3,3,3))
mat2

mtx<-matrix(1:12,nrow=3,ncol=4)
dimnames(mtx)<-list(letters[1:3],letters[1:4])
mtx

mtx<-rbind(mtx,rep(7,time=4))
mtx
mtx2<-matrix(1:10000,1000)
mtx2[777,3]

name <- c("Kildong","Heejin","Hana","Yujin")
english <- c(80, 50, 75, 77)
math <-c(90, 40, 96, 88)
name
english
math

df_exam<-data.frame(name,english,math)
df_exam
mean(df_exam$english)
mean(df_exam$math)
df_exam$average<-(df_exam$english+df_exam$math)/2
df_exam
dim(df_exam)
str(df_exam)
hist(df_exam$english)
df_exam$eng_pass<-ifelse(df_exam$english>=70,"pass","fail")
df_exam
df_exam$math_pass<-ifelse(df_exam$math>=90,"A",ifelse(df_exam$math>=80,"B","F"))
df_exam

library(dplyr)
df_exam %>% filter(math_pass!="F")
df_exam %>% filter(math_pass=="A"|math_pass=="B")
df_exam_new<-rename(df_exam,math_grade=math_pass)
df_exam_new
#수학 성적이 90점 이상의 학생만 추출
df_exam %>% filter(df_exam$math>=90)
#수학 성적이 90점 이상이며, 영어 성적이 80점 이상 학생을 추출
df_exam %>% filter(df_exam$math>=90 & df_exam$english>=80)

df_exam_english<-df_exam %>% select(name,english)
df_exam_english
df_exam_mathremove<-df_exam %>% select(-math)
df_exam_mathremove
df_exam %>% arrange(english)
df_exam %>% arrange(english,math)
df_exam %>% arrange(desc(english))
df_exam %>% mutate(total=english+math)
df_exam %>% mutate(total=english+math,mean=(english+math)/2)
df_exam %>% mutate(mathpass=ifelse(math>=70,"A","B"))
df_exam %>% summarise(math_mean=mean(math))
df_exam %>% summarise(math_mean=mean(math,na.rm=T))

class<-c(1,1,2,2)
df_exam<-data.frame(name,english,math,class)
df_exam %>% group_by(class) %>% summarise(math_mean=mean(math))

exam_score1<-data.frame(name=c("Kildong","Heegin","Hana","Yujin"),english=c(70,75,77,80))
exam_score2<-data.frame(name=c("Kildong","Heegin","Hana","Yujin"),math=c(40,96,88,90))
exam_score1
exam_score2
total_score<-left_join(exam_score1,exam_score2,by="name")
total_score

final_exam<-read.csv("exam_rev.csv")

#R 데이터 프레임과 SQL
library(sqldf)
data(mtcars)
colnames(mtcars)
rownames(mtcars)
mtcars2<-mtcars
mtcars2$carname<-rownames(mtcars2)
rownames(mtcars2)<-NULL
sqldf("select * from mtcars where mpg>=30")
sql_text<-"SELECT carname,mpg,hp,gear FROM mtcars2 WHERE mpg>=30"
sqldf(sql_text)
sql_text<-"SELECT * FROM mtcars2 WHERE mpg>=25 ORDER BY mpg"
sqldf(sql_text)
sql_text<-"SELECT gear,avg(mpg),avg(wt) FROM mtcars2 GROUP BY gear"
sqldf(sql_text)
sql_text<-"SELECT gear,avg(mpg) AS average_mpg,avg(wt) AS average_weight FROM mtcars2 GROUP BY gear"
sqldf(sql_text)
sql_text<-"SELECT carname,mpg,hp,wt FROM mtcars2 WHERE carname LIKE '%Mazda%'"
sqldf(sql_text)
library(dplyr)
df_mtcars2<-mtcars2 %>% filter(grepl("Mazda",carname))
df_mtcars2 %>% select(carname,mpg,hp,wt)

#R파일 입출력
exam_score<-read.csv(file="C:/Users/Lote/Desktop/4-1/빅데이터/5주차/exam_score.csv",header=FALSE)
View(exam_score)
library("dplyr")
exam_score<-rename(exam_score,id=V1,Sex=V2,math=V3,english=V4,korea=V5,class=V6)
head(exam_score)
str(exam_score)
exam_score<-read.csv(file="C:/Users/Lote/Desktop/빅데이터/5주차/exam_score.csv",stringsAsFactors=FALSE,header=FALSE)
str(exam_score)
exam_score<-rename(exam_score,id=V1,Sex=V2,math=V3,english=V4,korea=V5,class=V6)
exam_score$class=as.character(exam_score$class)
str(exam_score)
#결측지 확인하기
is.na(exam_score)
table(is.na(exam_score))
table(is.na(exam_score$math))
exam_score$math=as.integer(exam_score$math)
exam_score$english=as.integer(exam_score$english)
exam_score$korea=as.integer(exam_score$korea)
mean(exam_score$math)
#결측치 제거하기
exam_score %>% filter(!is.na(math))
exam_score %>% filter(!is.na(english)&!is.na(korea))
table(is.na(exam_score))
table(is.na(exam_score$math))
exam_score %>% filter(!is.na(math))
exam_score_omit<-na.omit(exam_score)
table(is.na(exam_score_omit))
library(ggplot2)
ggplot(exam_score_omit,aes(x=Sex,y=english))+geom_boxplot()
mean(exam_score$math,na.rm=T)
exam_score$math<-ifelse(is.na(exam_score$math),mean(exam_score$math,na.rm=T),exam_score$math)
mean(exam_score$math,na.rm=T)
sum(exam_score$english,na.rm=T)
sd(exam_score$korea,na.rm=T)
#class1과 class2에 따른 점수 평균 구하기
exam_score_mean<-exam_score %>% group_by(class) %>% summarise(mean_math=mean(math,na.rm=T),mean_english=mean(english,na.rm=T),mean_korea=mean(korea,na.rm=T))
exam_score_mean
#class 별 수학 점수 비교 그래프
ggplot(data=exam_score_mean,aes(x=class,y=mean_math))+geom_col()
#이상치 제거
install.packages("car")
library(car)
boxplot(Salaries$salary)$stats
ggplot(Salaries,aes(y=salary))+geom_boxplot()
ggplot(Salaries,aes(x=rank,y=salary))+geom_boxplot()
Salaries$salary<-ifelse(Salaries$salary<57800|Salaries$salary>194800,NA,Salaries$salary)
table(is.na(Salaries$salary))
Salaries_omit<-na.omit(Salaries)
table(is.na(Salaries_omit))
a<-read.table(file="C:/Users/Lote/Desktop/빅데이터/5주차/exam_score.txt",sep="\t")
View(a)
install.packages("readxl")
library(readxl)
read_excel("C:/Users/Lote/Desktop/빅데이터/5주차/exam_score.xls")
write.csv(exam_score_omit,file="C:/Users/Lote/Desktop/빅데이터/5주차/exam_score_omit.csv")

# R 빅데이터 데이터시각화
library(ggplot2)
data(mtcars)
str(mtcars)
head(mtcars)
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_point()
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_point()+labs(title="Fuel Consumption vs Weight",x="Weight",y="Fuel Consumption")
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_point()+labs(title="Fuel Consumption vs Weight",x="weight",y="Fuel Consumption")+xlim(0,7)+ylim(0,40)
mtcars$cyl=as.character(mtcars$cyl)
ggplot(data=mtcars,aes(x=cyl,y=mpg))+geom_boxplot()
ggplot(data=mtcars,aes(x=wt,y=mpg,col=cyl))+geom_point()
library(dplyr)
mtcars_cylmean <- mtcars %>% group_by(cyl) %>% summarise(mean_mpg=mean(mpg))
mtcars_cylmean
ggplot(data=mtcars_cylmean,aes(x=cyl,y=mean_mpg))+geom_col()
ggplot(data=mtcars_cylmean,aes(x=reorder(cyl,-mean_mpg),y=mean_mpg))+geom_col()
ggplot(data=mtcars,aes(x=cyl))+geom_bar()
unique(mpg$cyl)
ggplot(data=mtcars,aes(x=mpg))+geom_bar()
cyl_freq<-table(mtcars$cyl)
pie(cyl_freq)
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_smooth()
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_line()
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_smooth()+geom_point()
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_point(pch=17,color="pink",size=2)+  geom_smooth(method="lm",color="red",linetype=2,size=1)+labs(title="Fuel Cosumption vs Weight", x="Weight(1000 lbs)",y="Fuel Consump(miles/gallon)")
ggplot(data=mtcars,aes(x=wt,y=mpg))+geom_point(pch=17,color="pink",size=3)+
  geom_smooth(method="lm",color="red",linetype=2,size=1)+geom_text(label=rownames(mtcars),hjust=0,vjust=0,nudge_y=0.7,size=2)+labs(title="Fuel Comsumption vs Weight",x="Weight(1000 lbs)",y="fuel Consumption")

install.packages("car")
library(car)
data(Salaries)
str(Salaries)
head(Salaries)
graph1<-ggplot(Salaries,aes(x=rank))+geom_bar()
graph1
graph2=ggplot(Salaries,aes(x=salary))+geom_histogram()
graph2
Salaries<-rename(Salaries,workperiod=yrs.since.phd)
graph3<-ggplot(Salaries,aes(x=workperiod,y=salary))+geom_point()
graph3
graph4<-ggplot(Salaries,aes(x=rank,y=salary))+geom_boxplot()
install.packages("gridExtra")
library(gridExtra)
grid.arrange(graph1,graph2,graph3,graph4,nrow=2,ncol=2)
ggplot(Salaries,aes(x=salary,fill=rank))+geom_density(alpha=0.5)
ggplot(Salaries,aes(x=workperiod,y=salary,color=rank))+geom_point()
ggplot(Salaries,aes(x=workperiod,y=salary,color=rank,shape=sex))+geom_point()
ggplot(Salaries,aes(x=rank,fill=sex))+geom_bar(position="dodge")

data(economics)
str(economics)
head(economics)
ggplot(data=economics,aes(x=date,y=unemploy))+geom_line()
ggplot(data=economics,aes(x=date,y=psavert))+geom_line()

data("diamonds")
str(diamonds)
head(diamonds)
ggplot(data=diamonds,aes(group=cut_width(carat,width=0.3),x=price,y=carat))+geom_boxplot(color="blue",fill="gold")+labs(title="Diamond Price Distribution by Carat",x="Carat",y="Price(dollars)")

graph1<-ggplot(diamonds,aes(x=price,y=carat,color=color))+geom_point()
graph2<-ggplot(diamonds,aes(x=price,y=carat,color=clarity))+geom_point()
graph3<-ggplot(diamonds,aes(x=price,y=carat,color=cut))+geom_point()
grid.arrange(graph1,graph2,graph3)
ggplot(diamonds,aes(x=color,y=price))+geom_boxplot()
ggplot(diamonds,aes(x=clarity,y=price))+geom_boxplot()
ggplot(diamonds,aes(x=cut,y=price))+geom_boxplot()

#R워드 클라우드
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

data1<-c(1,2,3,4,5);data2<-c(11,12,13,14,22);data3<-c(101,102,101,220)
sapply(list(data1,data2,data3),mean)

txt<-c("a","ab","abc","abbc","abbbc","abbbbc")
grep("ab*c",txt,value=TRUE)
grep("a*c",txt,value=TRUE)
grep("a+b",txt,value=TRUE)
grep("a?c",txt,value=TRUE)

txt<-c("안녕하세요","정말요","진짜 안녕하신가요?")
grep("^안녕",txt,value=TRUE)
grep("요$",txt,value=TRUE)

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

#텍스트 마이닝
txt<-"안녕하세요. 반갑습니다. 3234 ? ;.    
그런데 R은 참 쉽네요. 자동차 냉장고 TV"
install.packages("tm")
library(tm)
cat(txt)
removeNumbers(txt)
removePunctuation(txt)
removeWords(txt,"냉장고")
removeWords(txt,"안녕")
stripWhitespace(txt)
data(acq)
docs<-acq[1]
docs[[1]]$content
docs<-tm_map(docs,removeNumbers)
docs[[1]]$content
docs<-tm_map(docs,removePunctuation)
docs[[1]]$content
docs<-tm_map(docs,removePunctuation,preserve_intra_word_dashes=TRUE)
docs<-tm_map(docs,removePunctuation,preserve_intra_word_dashes=TRUE,preserve_intra_word_contractions=TRUE)
docs<-tm_map(docs,removeWords,stopwords("english"))
docs$content

acq<-lapply(acq,removeWords,stopwords("english"))
docs<-tm_map(docs,stripWhitespace)
install.packages("SnowballC")
library(SnowballC)
docs<-tm_map(docs,stemDocument)


