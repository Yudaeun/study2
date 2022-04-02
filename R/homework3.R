
library(ggplot2)
library(dplyr)
midwest_raw<-as.data.frame(ggplot2::midwest)
midwest_new<-midwest_raw
midwest_new<-midwest_new %>% mutate(adultper=(popadults/poptotal)*100)
midwest_new %>% arrange(desc(adultper)) %>%
  select(county,adultper) %>%
  head(5)
midwest_new<-midwest_new %>%
  mutate(adultgrade=ifelse(adultper>=70,"large",
                           ifelse(adultper>=60,"middle","small")))
#21812167 ¿Ø¥Ÿ¿∫ 