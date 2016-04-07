# Hello

*A robust, simple, visitor check-in Java REST service*

###Motivation
> "Java? But there's so much boilerplate.."

###Use
```bash
> git clone https://github.com/lukecoy/Hello.git
> cd Hello/

# Make a sqlite db
> sqlite3 hello.db
  > CREATE TABLE name(name, date_met INTEGER);

> gradle run
```
> Note: You'll need to be running Java 8.  

###Resources
######`[GET] /hello/name-range?from=[int]&to=[int]`

######`[PUT] /hello?name=[String]`

###Glue
- [Dropwizard](https://github.com/dropwizard/dropwizard) for web-appin'
- [Gradle](https://github.com/gradle/gradle) for buildin'
- [Guice](https://github.com/google/guice) for dependency-injectin'
- [Sqlite](https://www.sqlite.org/) for databasin'
