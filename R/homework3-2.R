library(sqldf)
library(dplyr)
data(mtcars)
colnames(mtcars)
rownames(mtcars)
mtcars2<-mtcars
mtcars2$carname<-rownames(mtcars2)
rownames(mtcars2)<-NULL
mtcars2

#sqldf() �Լ��� �̿��ؼ� ��Ÿ����
sql_text<-"SELECT carname,mpg,hp,wt FROM mtcars2 WHERE carname LIKE 'Mazda%' or carname LIKE 'Merc%'"
sqldf(sql_text)

#�������������ε����� �̿��ؼ� ��Ÿ����
df_mtcars2<-mtcars2 %>% filter(grepl("Mazda|Merc",carname))
df_mtcars2 %>% select(carname,mpg,hp,wt)
#21812167 ������