library(sqldf)
library(dplyr)
data(mtcars)
colnames(mtcars)
rownames(mtcars)
mtcars2<-mtcars
mtcars2$carname<-rownames(mtcars2)
rownames(mtcars2)<-NULL
mtcars2

#sqldf() 함수를 이용해서 나타내기
sql_text<-"SELECT carname,mpg,hp,wt FROM mtcars2 WHERE carname LIKE 'Mazda%' or carname LIKE 'Merc%'"
sqldf(sql_text)

#데이터프레임인덱싱을 이용해서 나타내기
df_mtcars2<-mtcars2 %>% filter(grepl("Mazda|Merc",carname))
df_mtcars2 %>% select(carname,mpg,hp,wt)
#21812167 유다은
