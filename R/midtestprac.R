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
