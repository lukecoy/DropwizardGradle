# Hello

*A sneakily simple `"Hello, {}!"` Java REST service, well under 300 SLOC*

###Motivation
> "Java? But there's so much boilerplate.."

###Use
```bash
> brew install gradle # if you don't have gradle

> git clone https://github.com/lukecoy/Hello.git
> cd Hello/
> gradle run
```

###Resources
######`[GET] /hello/name-range?from=[int]&to=[int]`

######`[PUT] /hello?name=[String]`

###Glue
- [Dropwizard](https://github.com/dropwizard/dropwizard) for web-appin'
- [Gradle](https://github.com/gradle/gradle) for buildin'
- [Guice](https://github.com/google/guice) for dependency-injectin'
- [SqlLite](https://www.sqlite.org/) for databasin'
